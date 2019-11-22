package tudelft.discount;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Arrays;

public class DiscountApplierTest {

    @Test
    @DisplayName("Category Home, Verify Bal Price")
    void verifyBalPrice() {
        double price = 0.0;
        Product bal = new Product("Bal", 10.0, "HOME");
        Product pen = new Product("Pen", 10.0, "BUSINESS");
        ProductDao mockPdao = mock(ProductDao.class);
        List products = Arrays.asList(bal, pen);
        when(mockPdao.all()).thenReturn(products);
        DiscountApplier discountApplier = new DiscountApplier(mockPdao);
        discountApplier.setNewPrices();
        for (Product product : mockPdao.all()) {
            if (product.getName().equals("Bal")) {
                    price = product.getPrice();
            }
        }
        assertEquals(9.0, price, "Category HOME product: 10% discount on '10.0'");
    }

    @Test
    @DisplayName("Category Business, Verify Pen Price")
    void verifyPenPrice() {
        double price = 0.0;
        Product bal = new Product("Bal", 10.0, "HOME");
        Product pen = new Product("Pen", 10.0, "BUSINESS");
        ProductDao mockPdao = mock(ProductDao.class);
        List products = Arrays.asList(bal, pen);
        when(mockPdao.all()).thenReturn(products);
        DiscountApplier discountApplier = new DiscountApplier(mockPdao);
        discountApplier.setNewPrices();
        for (Product product : mockPdao.all()) {
            if (product.getName().equals("Pen")) {
                    price = product.getPrice();
            }
        }
        assertEquals(11.0, price, "Category BUSINESS product: 10% addition to '10.0'");
    }

}

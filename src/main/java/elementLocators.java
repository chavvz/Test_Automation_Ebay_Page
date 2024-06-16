public class elementLocators {

    //Xpaths
    String ebayHomePage = "//a[@title=\"My eBay\"]";
    String categoriesDropDown = "//select[@id='gh-cat']";
    String CategoryName = "//select[@id='gh-cat']//option[8]";
    String searchBar = "//input[@id='gh-ac']";
    String searchButton = "//input[@id='gh-btn']";
    String searchResultHeader = "(//div[@id='srp-river-main']//div[@class='s-item__title'])[raw]";
    String searchResultPrice = "(//div[@id='srp-river-main']//span[@class='s-item__price'])[raw]";
    String selectedItemName =  "//h1[@class='x-item-title__mainTitle']";
    String selectedItemPrice = "//div[@class='x-price-primary']//span[@class='ux-textspans']";
    String selectedItemColor = "//span[text()='Colour']/../..//select[@class='x-msku__select-box']";
    String selectedItemQuantity = "//input[@id='qtyTextBox']";
    String addToCartButton = "//span[text()='Add to cart']";
    String cartIcon = "//header/div[@id='gh-top']//li[@id='gh-minicart-hover']";
    String selectedItemCartName = "//h3[@class='item-title text-truncate-multiline black-link lines-2']";
    String selectedItemCartPrice = "(//div[@class='grid-item-price']//span[@class='text-display-span'])[1]";
    String selectedItemCartQuantity = "//div[@class='grid-item-quantity']//span[@class='select']/select";
    String goToCheckoutButton = "//button[text()='Go to checkout']";
    String continueAsGuestButton = "//button[@id='gxo-btn'][text()='Continue as guest']";
    String checkoutPage = "//h1[@class='page-title page-title--not-injectable'][text()='Checkout']";
    String checkoutItemName = "//h3[@class='item-title-header regular-text']";
    String checkoutItemPrice = "//div[@class='price-details']//span[@class='item-price']";
    String checkoutItemQuantity = "//div[@class='quantity-update']//select";
}

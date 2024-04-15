### WebShop Project

#### Overview
This project is designed to automate testing scenarios for a webshop application using Selenium WebDriver and JUnit. The webshop application under test is accessible at [DemoWebShop](https://demowebshop.tricentis.com/register). The tests cover various functionalities such as user registration, login, and book selection.

#### Prerequisites
- Java Development Kit (JDK)
- Selenium WebDriver
- ChromeDriver (for Chrome browser)

#### Setup
1. Ensure you have JDK installed on your system.
2. Download the ChromeDriver and specify its path in the `BaseTest` class.
3. Import the necessary libraries.
4. Clone this repository to your local machine.

#### Test Cases
1. **Books Test**
    - Test selecting 4, 8, 12, and 20 books from the dropdown menu.
    - Check if the correct number of books is displayed.
    - Verify the visibility of selected books.

2. **Login Test**
    - Test successful login with an existing user.
    - Test login with uppercase password.
    - Test login with a wrong email address.
    - Test login with empty fields.

3. **Registration Test**
    - Test successful user registration.
    - Test registration without confirming the password.
    - Test registration without providing an email address.
    - Test registration without providing the first name.
    - Test registration without providing the last name.
    - Test registration without providing a password.
    - Test registration with an invalid password.

#### Execution
1. Navigate to the project directory.
2. Run the test suite using JUnit.

#### Additional Notes
- The tests are designed to validate the functionality of the webshop application.
- Ensure proper configuration of the ChromeDriver path in the `BaseTest` class before execution.
- Modify test data and assertions as per the application requirements.
- This README provides an overview of the project and setup instructions. Detailed documentation for test cases can be found within the test classes.

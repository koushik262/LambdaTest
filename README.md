# LambdaTest
Test Scenarios

Test Scenario 1:

1. Open LambdaTest’s Selenium Playground from
https://www.lambdatest.com/selenium-playground
2. Click “Simple Form Demo” under Input Forms.
3. Validate that the URL contains “simple-form-demo”.
4. Create a variable for a string value E.g: “Welcome to LambdaTest”.
5. Use this variable to enter values in the “Enter Message” text box.
6. Click “Get Checked Value”.
7. Validate whether the same text message is displayed in the right-hand
panel under the “Your Message:” section.

Test Scenario 2:

1. Open the https://www.lambdatest.com/selenium-playground page and
click “Drag & Drop Sliders” under “Progress Bars & Sliders”.
2. Select the slider “Default value 15” and drag the bar to make it 95 by
validating whether the range value shows 95.

Test Scenario 3:

1. Open the https://www.lambdatest.com/selenium-playground page and
click “Input Form Submit” under “Input Forms”.
2. Click “Submit” without filling in any information in the form.
3. Assert “Please fill in the fields” error message.
4. Fill in Name, Email, and other fields.
5. From the Country drop-down, select “United States” using the text
property.
6. Fill all fields and click “Submit”.
7. Once submitted, validate the success message “Thanks for contacting
us, we will get back to you shortly.” on the screen.

Important Notes

1. You can choose your preferred version of the Java framework.
However, it is recommended to use the latest version of the framework.
2. Pass the browser and OS combinations to the test scenario using your
preferred data-driven approach provided by the framework.
3. Ensure that the functions in setup and teardown functions are not a
part of the @Test annotation.
4. The TimeOut of the test duration should be set to 20 seconds.
Parallelism should either be at the Class Level or Method Level (i.e.,
both the tests should be executing in parallel on LambdaTest).
5. Please ensure to use at least 3 different Locators while performing the
test.
6. Please ensure that network logs, video recording, screenshots, and
console logs are enabled in all the test runs. Please refer to the
Capability Generator for desired capabilities.
7. Refer to the detailed instructions appended below for submission
guidelines.


Execution

The test scenario should be demonstrated on the following combinations of
browsers and platforms (using Selenium 4 Grid and Selenium 4 Java):
1. Chrome + 88.0 + Windows 10
2. MicrosoftEdge + 87.0 + macOS Sierra
3. Firefox + 82.0 + Windows 7
4. Internet Explorer + 11.0 + Windows 10

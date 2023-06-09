import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://magento.softwaretestingboard.com/')

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Create an Account'))

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_First Name_firstname'), 'deksa ')

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_Last Name_lastname'), 'syafradha')

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_Email_email'), 'imandanislam@yahoo.co.id')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create New Customer Account/input_Password_password'), 'HqlUIEMTRIgdjjQs9ihJXw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create New Customer Account/input_Confirm Password_password_confirmation'), 
    'HqlUIEMTRIgdjjQs9ihJXw==')

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/span_Create an Account'))

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/html_var BASE_URL  httpsmagento.softwaretes_0869e4'))

WebUI.setText(findTestObject('Object Repository/Page_Create New Customer Account/input_Email_email'), 'imandanislam@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create New Customer Account/input_Password_password'), 'HqlUIEMTRIgdjjQs9ihJXw==')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Create New Customer Account/input_Confirm Password_password_confirmation'), 
    'HqlUIEMTRIgdjjQs9ihJXw==')

WebUI.click(findTestObject('Object Repository/Page_Create New Customer Account/span_Create an Account'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_My Account/span_Welcome, deksa syafradha'), 0)

WebUI.closeBrowser()


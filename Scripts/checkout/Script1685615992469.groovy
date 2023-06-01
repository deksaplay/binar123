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

WebUI.click(findTestObject('Object Repository/Page_Home Page/a_Sign In'))

WebUI.setText(findTestObject('Object Repository/Page_Customer Login/input_Email_loginusername'), 'syafradha@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Customer Login/input_Password_loginpassword'), 'HqlUIEMTRIgdjjQs9ihJXw==')

WebUI.click(findTestObject('Object Repository/Page_Customer Login/button_Sign In'))

WebUI.click(findTestObject('Object Repository/Page_Home Page/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Breathe-Easy Tank/div_SizeXSSMLXLColorrequire(    jquery,    _dee2be'))

WebUI.click(findTestObject('Object Repository/Page_Breathe-Easy Tank/div_XS'))

WebUI.click(findTestObject('Object Repository/Page_Breathe-Easy Tank/div_Color_option-label-color-93-item-59'))

WebUI.click(findTestObject('Object Repository/Page_Breathe-Easy Tank/span_Add to Cart'))

WebUI.click(findTestObject('Object Repository/Page_Breathe-Easy Tank/span_44items'))

WebUI.click(findTestObject('Object Repository/Page_Breathe-Easy Tank/button_Proceed to Checkout'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Company_company'), 'ewrfewfdsfds')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Street Address Line 1_street0'), 'fdsre')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_City_city'), 're')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout/select_Please select a region, state or pro_d80c8a'), 
    'Please select a region, state or province.', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout/select_Please select a region, state or pro_d80c8a'), 
    '42', true)

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_ZipPostal Code_postcode'), '4343')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout/select_Afghanistanland IslandsAlbaniaAlgeri_0c4dfd'), 
    'US', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Checkout/select_Afghanistanland IslandsAlbaniaAlgeri_0c4dfd'), 
    'ID', true)

WebUI.click(findTestObject('Object Repository/Page_Checkout/input_ZipPostal Code_postcode'))

WebUI.doubleClick(findTestObject('Object Repository/Page_Checkout/input_ZipPostal Code_postcode'))

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_ZipPostal Code_postcode'), '15412')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_StateProvince_region'), 'banten')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_City_city'), 'tangerang selatan')

WebUI.setText(findTestObject('Object Repository/Page_Checkout/input_Phone Number_telephone'), '083243243')

WebUI.click(findTestObject('Object Repository/Page_Checkout/button_Next'))

WebUI.click(findTestObject('Object Repository/Page_Checkout/span_Place Order'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Success Page/span_Thank you for your purchase'), 0)

WebUI.closeBrowser()


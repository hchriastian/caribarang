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

WebUI.navigateToUrl('https://dev.caribarang.id/')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_caribarang.id  Platform sourcing baran_552f8a/a_Masuk'))

WebUI.click(findTestObject('Object Repository/Page_Sign in  Caribarang/a_Daftar Sekarang'))

WebUI.setText(findTestObject('Object Repository/Page_Sign up  Caribarang/input_Nama_name'), 'test')

WebUI.setText(findTestObject('Object Repository/Page_Sign up  Caribarang/input_Email_email'), 'test@test.com')

WebUI.setText(findTestObject('Object Repository/Page_Sign up  Caribarang/input_No WhatsApp_phone'), '0812341234')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_Sign up  Caribarang/input_Password_password'), 'p4y+y39Ir5MkaMvQO1ylBg==')

WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Sign up  Caribarang/select_Pilih kategori yang kamu sukai Elekt_f39087'), 
    '1', true)

WebUI.click(findTestObject('Object Repository/Page_Sign up  Caribarang/button_Daftar'))


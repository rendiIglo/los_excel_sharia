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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

try {
    String s = WebUI.getUrl()

    WebUI.navigateToUrl('https://los-k2app.dev-ad.co.id/Identity/STS/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f%26wctx%3drm%253d1%2526id%253dpassive%2526ru%253d%25252fcustomForm%25252f%26wct%3d2020-04-18T06%253a35%253a06Z%26wreply%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f&wa=wsignin1.0&wtrealm=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f&wctx=rm%3d1%26id%3dpassive%26ru%3d%252fcustomForm%252f&wct=2020-04-18T06%3a35%3a06Z&wreply=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f')

    WebUI.maximizeWindow()
}
catch (def BrowserNotOpenedException) {
    WebUI.openBrowser('https://los-k2app.dev-ad.co.id/Identity/STS/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f%26wctx%3drm%253d1%2526id%253dpassive%2526ru%253d%25252fcustomForm%25252f%26wct%3d2020-04-18T06%253a35%253a06Z%26wreply%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f&wa=wsignin1.0&wtrealm=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f&wctx=rm%3d1%26id%3dpassive%26ru%3d%252fcustomForm%252f&wct=2020-04-18T06%3a35%3a06Z&wreply=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f')
} 

WebUI.setText(findTestObject('Login/input_Username_UserName'), 'Yani')

WebUI.setEncryptedText(findTestObject('Login/input_Username_Password'), '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('Login/a_Login'))

WebUI.delay(1)

WebUI.click(findTestObject('Master/a_LOS'))

WebUI.click(findTestObject('Master/a_Titipan Customer'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC.02_Titipan Customer/txtAppsNum'), '202007690LS00182')

WebUI.sendKeys(findTestObject('TC.02_Titipan Customer/txtAppsNum'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('TC.02_Titipan Customer/btnSearch'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingSearch'), 10)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingSearch'), 10)

WebUI.click(findTestObject('TC.02_Titipan Customer/span_FirstDataFound'))

WebUI.click(findTestObject('TC.02_Titipan Customer/btnProcess'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.02_Titipan Customer/btnAddTitipan'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.click(findTestObject('TC.02_Titipan Customer/addTitipan/ddlWayOfPayment'))

WebUI.click(findTestObject('TC.02_Titipan Customer/addTitipan/ddlWayOfPaymentItem_Bank Transfer'))

WebUI.click(findTestObject('TC.02_Titipan Customer/addTitipan/ddlBankName'))

WebUI.click(findTestObject('TC.02_Titipan Customer/addTitipan/ddlBankNameItem_BRI Syariah'))

WebUI.setText(findTestObject('TC.02_Titipan Customer/addTitipan/txtBankAccount'), '12345678901')

WebUI.setText(findTestObject('TC.02_Titipan Customer/addTitipan/txtBankAccountName'), 'Ai Cucum Kumalasari')

WebUI.setText(findTestObject('TC.02_Titipan Customer/addTitipan/txtTransferDate'), '10-Jul-2020')

WebUI.setText(findTestObject('TC.02_Titipan Customer/addTitipan/txtAmountReceived'), '1500000')

WebUI.setText(findTestObject('TC.02_Titipan Customer/addTitipan/txtReceivedFrom'), 'Ai Cucum')

WebUI.setText(findTestObject('TC.02_Titipan Customer/addTitipan/txtDescription'), 'Cicilan DP ke 2')

WebUI.click(findTestObject('TC.02_Titipan Customer/addTitipan/btnSave'))


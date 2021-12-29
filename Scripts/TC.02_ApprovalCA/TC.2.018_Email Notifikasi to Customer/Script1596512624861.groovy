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

WebUI.setText(findTestObject('Login/input_Username_UserName'), 'CASyariah')

WebUI.setEncryptedText(findTestObject('Login/input_Username_Password'), '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('Login/a_Login'))

WebUI.delay(1)

WebUI.click(findTestObject('Master/a_LOS'))

WebUI.click(findTestObject('Master/a_Approval Decision'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.click(findTestObject('TC.02_ApprovalCA/btnSearchAppsNumber'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('TC.02_ApprovalCA/txtAppsNumPopUp'), '202007690LS00379')

not_run: WebUI.click(findTestObject('TC.02_ApprovalCA/btnSearchAppsNumberPopUp'))

not_run: WebUI.click(findTestObject('TC.02_ApprovalCA/span_FirstDataFoundPopUp'))

not_run: WebUI.click(findTestObject('TC.02_ApprovalCA/btnSearchAppsNumberPopUpOk'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('TC.02_ApprovalCA/btnSearch'))

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingSearch'), 10)

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoadingSearch'), 10)

WebUI.click(findTestObject('TC.02_ApprovalCA/span_FirstDataFound'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.02_ApprovalCA/btnProcess'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.02_ApprovalCA/btnApprove'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('https://mail.dev-ad.co.id/owa/#path=/mail')

WebUI.setText(findTestObject('email/input_Username'), 'sylvia@dev-ad.co.id')

WebUI.setEncryptedText(findTestObject('email/input_Password'), '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('email/button_SignIn'))

WebUI.delay(30)

WebUI.refresh(FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot()

WebUI.click(findTestObject('email/span_firstData'))

WebUI.delay(1)

WebUI.waitForElementNotVisible(findTestObject('email/divLoadingMail'), 20)

WebUI.waitForElementPresent(findTestObject('email/divLoadingMail'), 20)

WebUI.takeScreenshot()

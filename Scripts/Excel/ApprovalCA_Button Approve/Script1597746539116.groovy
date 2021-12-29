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

WebUI.openBrowser('')

WebUI.navigateToUrl('http://los-k2app.dev-ad.co.id/CustomForm/')

not_run: WebUI.click(findTestObject('Master/a_User'))

not_run: WebUI.click(findTestObject('Master/button_Logout'))

WebUI.delay(1)

WebUI.setText(findTestObject('Login/input_Username_UserName'), 'CASyariah')

WebUI.setEncryptedText(findTestObject('Login/input_Username_Password'), '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('Login/a_Login'))

WebUI.delay(1)

WebUI.click(findTestObject('Master/a_LOS'))

WebUI.click(findTestObject('Master/a_Approval Decision'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.click(findTestObject('TC.02_ApprovalCA/btnSearchAppsNumber'))

WebUI.delay(1)

WebUI.setText(findTestObject('TC.02_ApprovalCA/txtAppsNumPopUp'), AppNum)

WebUI.click(findTestObject('TC.02_ApprovalCA/btnSearchAppsNumberPopUp'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.02_ApprovalCA/span_FirstDataFoundPopUp'))

WebUI.click(findTestObject('TC.02_ApprovalCA/btnSearchAppsNumberPopUpOk'))

WebUI.delay(1)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.02_ApprovalCA/btnSearch'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingSearch'), 10)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingSearch'), 5)

WebUI.click(findTestObject('TC.02_ApprovalCA/span_FirstDataFound'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.02_ApprovalCA/btnProcess'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.click(findTestObject('TC.02_ApprovalCA/btnApprove'))

WebUI.delay(1)

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.delay(1)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)


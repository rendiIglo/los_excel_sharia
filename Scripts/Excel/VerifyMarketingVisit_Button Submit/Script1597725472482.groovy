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

WebUI.click(findTestObject('Master/a_User'))

WebUI.click(findTestObject('Master/button_Logout'))

WebUI.delay(1)

WebUI.setText(findTestObject('Login/input_Username_UserName'), 'mkthead')

WebUI.setEncryptedText(findTestObject('Login/input_Username_Password'), '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('Login/a_Login'))

WebUI.delay(1)

WebUI.click(findTestObject('Master/a_Leads Management'))

WebUI.click(findTestObject('Master/a_Verify Marketing Visit Result'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/txtLeadsID'), leadsID)

WebUI.sendKeys(findTestObject('TC.02_Verify Marketing Visit Result/txtLeadsID'), Keys.chord(Keys.TAB))

WebUI.delay(1)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/a_SearchButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingSearch'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingSearch'), 5)

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/span_FoundFirstData'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/a_UpdateButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 20)

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Leads Detail/a_LeadDetail'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Leads Detail/a_Submit'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.delay(1)

WebUI.click(findTestObject('Master/a_User'))

WebUI.click(findTestObject('Master/button_Logout'))

WebUI.delay(2)

not_run: WebUI.closeBrowser()


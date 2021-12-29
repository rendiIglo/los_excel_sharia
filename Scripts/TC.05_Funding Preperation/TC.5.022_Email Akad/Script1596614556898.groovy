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

try {
    WebUI.getUrl()

    WebUI.navigateToUrl('https://mail.dev-ad.co.id/owa/auth/logon.aspx?replaceCurrent=1&url=https%3a%2f%2fmail.dev-ad.co.id%2fowa%2f%23authRedirect%3dtrue')
}
catch (def BrowserNotOpenedException) {
    WebUI.openBrowser('https://mail.dev-ad.co.id/owa/auth/logon.aspx?replaceCurrent=1&url=https%3a%2f%2fmail.dev-ad.co.id%2fowa%2f%23authRedirect%3dtrue')
} 

WebUI.setText(findTestObject('TC.05_Funding_Preparation/Check Email/input_Username_UserName'), 'sylvia@dev-ad.co.id')

WebUI.setEncryptedText(findTestObject('TC.05_Funding_Preparation/Check Email/input_Username_Password'), '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('TC.05_Funding_Preparation/Check Email/a_Login'))

WebUI.delay(10)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)


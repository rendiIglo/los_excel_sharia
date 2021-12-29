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

WebUI.delay(1)

WebUI.refresh()

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Master/a_LOS'))

WebUI.click(findTestObject('Master/a_Print Document'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC.03_Print Document/txtAppsNum'), AppNum)

WebUI.sendKeys(findTestObject('TC.03_Print Document/txtAppsNum'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('TC.03_Print Document/ddl_DocumentType'))

WebUI.click(findTestObject('TC.03_Print Document/ddl_DocumentTypeItem_AKAD'))

WebUI.click(findTestObject('TC.03_Print Document/btnSearch'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingSearch'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingSearch'), 10)

WebUI.click(findTestObject('TC.03_Print Document/span_FirstDataFound'))

WebUI.click(findTestObject('TC.03_Print Document/btnDownload'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.click(findTestObject('TC.03_Print Document/PopUpPrintDocument/span_FirstDataFound'))

WebUI.click(findTestObject('TC.03_Print Document/PopUpPrintDocument/btnDownload'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 10)

WebUI.click(findTestObject('TC.03_Print Document/PopUpPrintDocument/btnSave'))


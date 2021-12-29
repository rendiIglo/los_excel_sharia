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

WebUI.delay(1)

WebUI.refresh()

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Master/a_LOS'))

WebUI.click(findTestObject('TC.05_Funding_Preparation/Screen Funding Preparation/menu Funding Preparation'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

'lihat data yang ada'
WebUI.setText(findTestObject('TC.05_Funding_Preparation/Screen Funding Preparation/text App Number'), AppNum)

WebUI.click(findTestObject('TC.05_Funding_Preparation/Screen Funding Preparation/select icon resolve'))

WebUI.click(findTestObject('TC.05_Funding_Preparation/Screen Funding Preparation/btnSearch'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.delay(1)

WebUI.click(findTestObject('TC.05_Funding_Preparation/Screen Funding Preparation/select data funding preparation'))

WebUI.click(findTestObject('TC.05_Funding_Preparation/Screen Funding Preparation/btnProcess'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.delay(3)

WebUI.click(findTestObject('TC.05_Funding_Preparation/Screen Funding Preparation/btnSave'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.delay(1)

WebUI.click(findTestObject('TC.05_Funding_Preparation/Screen Funding Preparation/btnOk'))

WebUI.click(findTestObject('TC.05_Funding_Preparation/Screen Funding Preparation/btnSubmit'))

WebUI.click(findTestObject('TC.05_Funding_Preparation/Screen Funding Preparation/btnOk'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)


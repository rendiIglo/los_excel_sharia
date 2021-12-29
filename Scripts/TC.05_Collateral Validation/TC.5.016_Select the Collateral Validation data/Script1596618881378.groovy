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
    String s = WebUI.getUrl()

    WebUI.navigateToUrl('https://los-k2app.dev-ad.co.id/Identity/STS/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f%26wctx%3drm%253d1%2526id%253dpassive%2526ru%253d%25252fcustomForm%25252f%26wct%3d2020-04-18T06%253a35%253a06Z%26wreply%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f&wa=wsignin1.0&wtrealm=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f&wctx=rm%3d1%26id%3dpassive%26ru%3d%252fcustomForm%252f&wct=2020-04-18T06%3a35%3a06Z&wreply=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f')
}
catch (def BrowserNotOpenedException) {
    WebUI.openBrowser('https://los-k2app.dev-ad.co.id/Identity/STS/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f%26wctx%3drm%253d1%2526id%253dpassive%2526ru%253d%25252fcustomForm%25252f%26wct%3d2020-04-18T06%253a35%253a06Z%26wreply%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f&wa=wsignin1.0&wtrealm=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f&wctx=rm%3d1%26id%3dpassive%26ru%3d%252fcustomForm%252f&wct=2020-04-18T06%3a35%3a06Z&wreply=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f')
} 

WebUI.setText(findTestObject('Login/input_Username_UserName'), 'Yani')

WebUI.setEncryptedText(findTestObject('Login/input_Username_Password'), '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('Login/a_Login'))

WebUI.delay(1)

WebUI.click(findTestObject('Master/a_LOS'))

WebUI.click(findTestObject('TC.05_Collateral Validation/menu Collateral Validation'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

'lihat data yang ada'
not_run: WebUI.setText(findTestObject('TC.05_Collateral Validation/text App Number'), '202007690LS00033')

not_run: WebUI.click(findTestObject('TC.05_Collateral Validation/select icon resolve'))

'lihat data yang ada'
not_run: WebUI.setText(findTestObject('TC.05_Collateral Validation/text App Date 1'), '01-Jul-2020')

'lihat data yang ada'
not_run: WebUI.setText(findTestObject('TC.05_Collateral Validation/text App Date 2'), '10-Jul-2020')

WebUI.click(findTestObject('TC.05_Collateral Validation/klik drop down branch'))

WebUI.click(findTestObject('TC.05_Collateral Validation/select branch'))

'lihat data yang ada'
not_run: WebUI.setText(findTestObject('TC.05_Collateral Validation/txtCustomerName'), 'BUDIMAN')

'lihat data yang ada'
not_run: WebUI.setText(findTestObject('TC.05_Collateral Validation/text Approval Date 1'), '01-Jul-2020')

'lihat data yang ada'
not_run: WebUI.setText(findTestObject('TC.05_Collateral Validation/text Approval Date 2'), '10-Jul-2020')

WebUI.click(findTestObject('TC.05_Collateral Validation/btnSearch'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.05_Collateral Validation/select data collateral validation'))

WebUI.click(findTestObject('TC.05_Collateral Validation/btnProcess'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.delay(5)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.delay(5)

not_run: WebUI.click(findTestObject('TC.05_Collateral Validation/klik option eksterior mobil'))

not_run: WebUI.delay(3)

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.click(findTestObject('TC.05_Collateral Validation/klik drop down value eksterior'))

not_run: WebUI.click(findTestObject('TC.05_Collateral Validation/select data eksterior mobil'))

not_run: WebUI.click(findTestObject('TC.05_Collateral Validation/btnSavePopUp'))

not_run: WebUI.click(findTestObject('TC.05_Collateral Validation/select data for upload'))

not_run: WebUI.click(findTestObject('TC.05_Collateral Validation/klik tulisan upload'))

not_run: WebUI.delay(3)

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.setText(findTestObject('Master/UploadPhoto/txtReceiveBy'), 'CA Syariah')

not_run: WebUI.setText(findTestObject('Master/UploadPhoto/txtDocumentNo'), '2')

not_run: WebUI.click(findTestObject('TC.05_Collateral Validation/klik gambar upload'))

not_run: CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.02_Collateral Validation/UploadPhoto/divUploadDocument'), 
    GlobalVariable.filePath + '\\fotodenganrumah.jpg')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('TC.05_Collateral Validation/btnSavePopUp'))

not_run: WebUI.delay(3)

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.click(findTestObject('TC.05_Collateral Validation/btnOkPopUp'))

not_run: WebUI.delay(3)

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.click(findTestObject('TC.05_Collateral Validation/btnSave'))

not_run: WebUI.delay(3)

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.click(findTestObject('TC.05_Collateral Validation/btnOk'))

not_run: WebUI.delay(3)

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)


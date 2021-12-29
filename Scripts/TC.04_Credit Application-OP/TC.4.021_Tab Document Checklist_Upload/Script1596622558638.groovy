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

WebUI.click(findTestObject('Master/a_Credit Application'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/txtAppsNum'), '202007690LS00379')

WebUI.sendKeys(findTestObject('TC.03_Credit Application-Credit Analyst/txtAppsNum'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/btnSearch'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingSearch'), 10)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingSearch'), 10)

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/span_FirstDataFound'))

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/btnProcess'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.comment('Collateral')

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/ddl_Color'))

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/ddl_ColorItem_Hitam'))

WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/txtNoRangka'), '33344411R')

WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/txtProductionYear'), '2011')

WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/txtLicensePlate'), 'BK 466 OR')

WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/txtNoMesin'), '545456677R')

WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/txtBPKPNo'), '45334566R')

WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/txtAddressOnBPKP'), 'JL. CEMPAKA No. 12')

WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/txtNameOnBPKP'), 'Gon Freecss')

WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/txtRT'), '001')

WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/txtRW'), '002')

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/btnSave'))

WebUI.click(findTestObject('Master/btnOk'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.comment('Customer')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Customer/ddl_Religion'))

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Customer/ddl_Religion_Islam'))

WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Customer/txtCreditLimit'), '565760000')

WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Customer/txtFixIncome'), '15600000')

WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Customer/txtEmergencyFixIncome'), '12130000')

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Customer/btnSave'))

WebUI.click(findTestObject('Master/btnOk'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.comment('Finance Info')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Finance Info/ddl_TujuanPengunaanMobil'))

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Finance Info/ddl_TujuanPengunaanMobilItem_Mobil Baru'))

WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Finance Info/txtHargaBeli'), '70008000')

WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Finance Info/txtDPAmount'), '31200000')

WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Finance Info/txtTenor'), '36')

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Finance Info/btnSave'))

WebUI.click(findTestObject('Master/btnOk'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.comment('Document')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Document/span_thirdDataFound'))

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Document/btnUpload'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 10)

WebUI.setText(findTestObject('Master/UploadPhoto/txtReceiveBy'), 'Iwan')

WebUI.setText(findTestObject('Master/UploadPhoto/txtDocumentNo'), '1')

WebUI.setText(findTestObject('Master/UploadPhoto/txtExpiredDate'), '02-Jul-2021')

WebUI.click(findTestObject('Master/UploadPhoto/divUploadDocument'))

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Credit Application-Credit Analyst/Document/divUploadDocument'), 
    GlobalVariable.filePath + '\\fotodenganrumah.jpg')

WebUI.delay(5)

WebUI.click(findTestObject('Master/UploadPhoto/btnSave'))

WebUI.click(findTestObject('Master/btnOk'))

WebUI.delay(2)

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Document/btnSave'))


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

WebUI.click(findTestObject('Master/a_User'))

WebUI.click(findTestObject('Master/button_Logout'))

WebUI.delay(2)

WebUI.setText(findTestObject('Login/input_Username_UserName'), 'Yani')

WebUI.setEncryptedText(findTestObject('Login/input_Username_Password'), '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('Login/a_Login'))

WebUI.delay(1)

WebUI.click(findTestObject('Master/a_LOS'))

WebUI.click(findTestObject('Master/a_Credit Application'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/txtAppsNum'), AppNum)

WebUI.sendKeys(findTestObject('TC.03_Credit Application-Credit Analyst/txtAppsNum'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/btnSearch'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingSearch'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingSearch'), 10)

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/span_FirstDataFound'))

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/btnProcess'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.comment('Collateral')

not_run: WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/ddl_Color'))

not_run: WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/ddl_ColorItem_Hitam'))

not_run: WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/txtNoRangka'), '33344411R')

not_run: WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/txtProductionYear'), '2011')

not_run: WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/txtLicensePlate'), 'BK 466 OR')

not_run: WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/txtNoMesin'), '545456677R')

not_run: WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/txtBPKPNo'), '45334566R')

not_run: WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/txtAddressOnBPKP'), 'JL. CEMPAKA No. 12')

not_run: WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/txtNameOnBPKP'), 'Gon Freecss')

not_run: WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/txtRT'), '001')

not_run: WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/txtRW'), '002')

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Collateral/btnSave'))

WebUI.click(findTestObject('Master/btnOk'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.comment('Customer')

WebUI.scrollToPosition(0, 0)

not_run: WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Customer/ddl_Religion'))

not_run: WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Customer/ddl_Religion_Islam'))

not_run: WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Customer/txtCreditLimit'), '565760000')

not_run: WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Customer/txtFixIncome'), '15600000')

not_run: WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Customer/txtEmergencyFixIncome'), '12130000')

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Customer/btnSave'))

WebUI.click(findTestObject('Master/btnOk'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.comment('Finance Info')

WebUI.scrollToPosition(0, 0)

not_run: WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Finance Info/ddl_TujuanPengunaanMobil'))

not_run: WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Finance Info/ddl_TujuanPengunaanMobilItem_Mobil Baru'))

not_run: WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Finance Info/txtHargaBeli'), '70008000')

not_run: WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Finance Info/txtDPAmount'), '31200000')

not_run: WebUI.setText(findTestObject('TC.03_Credit Application-Credit Analyst/Finance Info/txtTenor'), '36')

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Finance Info/btnSave'))

WebUI.click(findTestObject('Master/btnOk'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.comment('Document')

WebUI.scrollToPosition(0, 0)

not_run: WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Document/span_thirdDataFound'))

not_run: WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Document/btnUpload'))

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 5)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 10)

not_run: WebUI.setText(findTestObject('Master/UploadPhoto/txtReceiveBy'), 'Iwan')

not_run: WebUI.setText(findTestObject('Master/UploadPhoto/txtDocumentNo'), '1')

not_run: WebUI.setText(findTestObject('Master/UploadPhoto/txtExpiredDate'), '02-Jul-2021')

not_run: WebUI.click(findTestObject('Master/UploadPhoto/divUploadDocument'))

not_run: CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.03_Credit Application-Credit Analyst/Document/divUploadDocument'), 
    GlobalVariable.filePath + '\\fotodenganrumah.jpg')

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('Master/UploadPhoto/btnSave'))

not_run: WebUI.click(findTestObject('Master/btnOk'))

WebUI.scrollToPosition(0, 9999)

WebUI.delay(3)

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Document/btnSave'))

WebUI.click(findTestObject('Master/btnOk'))

WebUI.delay(2)

WebUI.click(findTestObject('TC.03_Credit Application-Credit Analyst/Document/btnSubmit'))

WebUI.click(findTestObject('Master/btnOk'))

WebUI.delay(2)


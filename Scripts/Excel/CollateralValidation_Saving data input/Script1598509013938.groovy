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

WebUI.delay(1)

WebUI.refresh()

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Master/a_LOS'))

WebUI.click(findTestObject('TC.05_Collateral Validation/menu Collateral Validation'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

'lihat data yang ada'
WebUI.setText(findTestObject('TC.05_Collateral Validation/text App Number'), AppNum)

'lihat data yang ada'
WebUI.sendKeys(findTestObject('TC.05_Collateral Validation/text App Number'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('TC.05_Collateral Validation/btnSearch'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.05_Collateral Validation/select data collateral validation'))

WebUI.click(findTestObject('TC.05_Collateral Validation/btnProcess'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.delay(5)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/SpanExteriorMobil'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 5, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralCondition'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralConditionItem_Ada Modifikasi'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/a_SaveButtonPopUp'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/SpanInteriorMobil'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 5, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralCondition'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralConditionItem_Ada Modifikasi'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/a_SaveButtonPopUp'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/SpanKondisiMesin'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 5, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralCondition'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralConditionItem_Mesin Hidup'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/a_SaveButtonPopUp'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/SpanDokumen'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 5, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralCondition'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralConditionItem_Sesuai Fisik'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/a_SaveButtonPopUp'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/SpanKM'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 5, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralCondition'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralConditionItem_Up 1000'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/a_SaveButtonPopUp'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/SpanKaroseriKhusus'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 5, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralCondition'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralConditionItem_Normal'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/a_SaveButtonPopUp'))

WebUI.delay(1)

not_run: WebUI.click(findTestObject('TC.05_Collateral Validation/select data for upload'))

not_run: WebUI.click(findTestObject('TC.05_Collateral Validation/klik tulisan upload'))

not_run: WebUI.delay(3)

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.setText(findTestObject('Master/UploadPhoto/txtReceiveBy'), 'CA Syariah')

not_run: WebUI.setText(findTestObject('Master/UploadPhoto/txtDocumentNo'), '2')

not_run: WebUI.click(findTestObject('TC.05_Collateral Validation/klik gambar upload'))

not_run: CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.02_Collateral Validation/UploadPhoto/divUploadDocument'), 
    GlobalVariable.filePath + '\\fotodenganrumah.jpg')

not_run: WebUI.delay(3)

not_run: WebUI.click(findTestObject('TC.05_Collateral Validation/btnSavePopUp'))

not_run: WebUI.delay(3)

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.click(findTestObject('TC.05_Collateral Validation/btnOkPopUp'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.05_Collateral Validation/btnSave'))

WebUI.click(findTestObject('TC.05_Collateral Validation/btnOk'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)


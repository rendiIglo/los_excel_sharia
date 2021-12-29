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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.refresh()

WebUI.click(findTestObject('Master/a_Leads Management'))

WebUI.click(findTestObject('Master/a_Collateral Appraisal Sharia'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20, FailureHandling.OPTIONAL)

WebUI.delay(3)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/ddlProduct'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/ddlProductItem_MyCars'))

WebUI.setText(findTestObject('TC.04_Collateral Appraisal/txtLeadsID'), leadsID)

WebUI.sendKeys(findTestObject('TC.04_Collateral Appraisal/txtLeadsID'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/a_SearchButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingSearch'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingSearch'), 5)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/span_FoundFirstData'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/a_ProcessButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20, FailureHandling.OPTIONAL)

WebUI.delay(10)

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

WebUI.comment('Document')

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/SpanUploadFotoKanan'))

WebUI.delay(2)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/a_UploadButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingUploadFile'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingUploadFile'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtReceivedBy'), 'Rexy')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtExpiredDate'), '28-Jun-2021')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtDocumentNumber'), '8938949124729829')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/divAttachFile'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.05_Input Marketing Visit/Document/divAttachFile'), 
    'E:\\my Documents\\ekreasi\\internal project\\Katalon\\sharia-leads\\KTP.png')

WebUI.delay(5)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/a_SaveButtonPopUp'))

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/SpanUploadFotoKiri'))

WebUI.delay(2)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/a_UploadButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingUploadFile'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingUploadFile'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtReceivedBy'), 'Rexy')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtExpiredDate'), '28-Jun-2021')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtDocumentNumber'), '8938949124729829')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/divAttachFile'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.05_Input Marketing Visit/Document/divAttachFile'), 
    'E:\\my Documents\\ekreasi\\internal project\\Katalon\\sharia-leads\\KTP.png')

WebUI.delay(5)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/a_SaveButtonPopUp'))

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/SpanUploadFotoBelakang'))

WebUI.delay(2)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/a_UploadButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingUploadFile'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingUploadFile'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtReceivedBy'), 'Rexy')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtExpiredDate'), '28-Jun-2021')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtDocumentNumber'), '8938949124729829')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/divAttachFile'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.05_Input Marketing Visit/Document/divAttachFile'), 
    'E:\\my Documents\\ekreasi\\internal project\\Katalon\\sharia-leads\\KTP.png')

WebUI.delay(5)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/a_SaveButtonPopUp'))

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/SpanUploadFotoDepan'))

WebUI.delay(2)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/a_UploadButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingUploadFile'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingUploadFile'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtReceivedBy'), 'Rexy')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtExpiredDate'), '28-Jun-2021')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtDocumentNumber'), '8938949124729829')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/divAttachFile'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.05_Input Marketing Visit/Document/divAttachFile'), 
    'E:\\my Documents\\ekreasi\\internal project\\Katalon\\sharia-leads\\KTP.png')

WebUI.delay(5)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/a_SaveButtonPopUp'))

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 60)

WebUI.delay(1)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/SpanUploadNoRangka'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/a_UploadButton'))

WebUI.switchToFrame(findTestObject('Master/iframe_idIframe'), 0)

WebUI.scrollToPosition(0, 0)

WebUI.switchToDefaultContent()

WebUI.waitForElementPresent(findTestObject('Master/divLoadingUploadFile'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingUploadFile'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtReceivedBy'), 'Rexy')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtExpiredDate'), '28-Jun-2021')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtDocumentNumber'), '8938949124729829')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/divAttachFile'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.05_Input Marketing Visit/Document/divAttachFile'), 
    'E:\\my Documents\\ekreasi\\internal project\\Katalon\\sharia-leads\\KTP.png')

WebUI.delay(5)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/a_SaveButtonPopUp'))

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/a_SaveButton'))

WebUI.delay(3)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()


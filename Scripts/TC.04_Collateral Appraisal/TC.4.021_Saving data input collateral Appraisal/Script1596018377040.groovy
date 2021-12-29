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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://los-k2app.dev-ad.co.id/Identity/STS/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f%26wctx%3drm%253d1%2526id%253dpassive%2526ru%253d%25252fcustomForm%25252f%26wct%3d2020-04-18T06%253a35%253a06Z%26wreply%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f&wa=wsignin1.0&wtrealm=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f&wctx=rm%3d1%26id%3dpassive%26ru%3d%252fcustomForm%252f&wct=2020-04-18T06%3a35%3a06Z&wreply=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f')

WebUI.setText(findTestObject('Login/input_Username_UserName'), 'mktSyariah1')

WebUI.setEncryptedText(findTestObject('Login/input_Username_Password'), '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('Login/a_Login'))

WebUI.click(findTestObject('Master/a_Leads Management'))

WebUI.click(findTestObject('Master/a_Collateral Appraisal Sharia'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/ddlProduct'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/ddlProductItem_MyCars'))

WebUI.setText(findTestObject('TC.04_Collateral Appraisal/txtLeadsID'), '20200729690L001300')

WebUI.sendKeys(findTestObject('TC.04_Collateral Appraisal/txtLeadsID'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/a_SearchButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingSearch'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingSearch'), 5)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/span_FoundFirstData'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/a_ProcessButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20, FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/SpanExteriorMobil'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralCondition'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralConditionItem_Ada Modifikasi'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/a_SaveButtonPopUp'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/SpanInteriorMobil'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralCondition'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralConditionItem_Ada Modifikasi'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/a_SaveButtonPopUp'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/SpanKondisiMesin'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralCondition'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralConditionItem_Mesin Hidup'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/a_SaveButtonPopUp'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/SpanDokumen'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralCondition'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralConditionItem_Sesuai Fisik'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/a_SaveButtonPopUp'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/SpanKM'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralCondition'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralConditionItem_Up 1000'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/a_SaveButtonPopUp'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/SpanKaroseriKhusus'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20, FailureHandling.OPTIONAL)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralCondition'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/ddlCollateralConditionItem_Normal'))

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/a_SaveButtonPopUp'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/SpanUploadFotoKanan'))

WebUI.delay(2)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/a_UploadButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingUploadFile'), 20)

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

WebUI.click(findTestObject('TC.04_Collateral Appraisal/CollateralCondition/a_SaveButton'))

WebUI.delay(3)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()


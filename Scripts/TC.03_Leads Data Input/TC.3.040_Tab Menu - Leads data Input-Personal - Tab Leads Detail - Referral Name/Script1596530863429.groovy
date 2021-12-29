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
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW

WebUI.openBrowser('')

WebUI.navigateToUrl('https://los-k2app.dev-ad.co.id/Identity/STS/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f%26wctx%3drm%253d1%2526id%253dpassive%2526ru%253d%25252fcustomForm%25252f%26wct%3d2020-04-18T06%253a35%253a06Z%26wreply%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f&wa=wsignin1.0&wtrealm=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f&wctx=rm%3d1%26id%3dpassive%26ru%3d%252fcustomForm%252f&wct=2020-04-18T06%3a35%3a06Z&wreply=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f')

WebUI.setText(findTestObject('Login/input_Username_UserName'), 'mktSyariah1')

WebUI.setEncryptedText(findTestObject('Login/input_Username_Password'), '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('Login/a_Login'))

WebUI.click(findTestObject('Master/a_Leads Management'))

WebUI.click(findTestObject('Master/a_Leads Data Input'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Master/ddl_SubBranch'))

WebUI.click(findTestObject('Master/ddl_SubBranch'))

WebUI.click(findTestObject('Master/span_ddlSubBranch_Tangerang Syariah'))

WebUI.click(findTestObject('Master/ddl_GeraiInput'))

WebUI.click(findTestObject('Master/span_ddlGeraiInput_Tangerang Syariah'))

WebUI.click(findTestObject('Master/ddl_Product'))

WebUI.click(findTestObject('Master/span_ddlProduct_My CarS'))

WebUI.click(findTestObject('Master/a_NextButton'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.click(findTestObject('Master/div_menuCustomer'))

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtCustomer'), 'Aisha Aziza')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtIdNo'), '2345675209910001')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtAreaPhone'), '021')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtPhone'), '777212')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtMobilePhone1'), '081234567890')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtMobilePhone2'), '081234567891')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtDateOfBirth'), '12-Sep-1991')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtEmail'), 'sylvia@dev-ad.co.id')

WebUI.click(findTestObject('TC.03_Leads Data Input/Customer/ddl_MaritalStatus'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Customer/span_ddlMartialStatus_Married'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Customer/rb_GenderFemale'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Customer/rb_NationalityWNI'))

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtPlaceOfBirth'), 'Aceh')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtMotherMaidenName'), 'Sarah')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtNpwp'), '6800005009393000')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtMonthlyIncome'), '10.000.000')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtNameSpouse'), 'Kang Ujang')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtIdNoSpouse'), '2345671206890001')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtMobilePhoneSpouse'), '0857363636')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtDateOfBirthSpouse'), '12-Jun-1989')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtPlaceOfBirthSpouse'), 'Jakarta')

WebUI.click(findTestObject('TC.03_Leads Data Input/Customer/a_NextButton'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Customer/a_OkButton'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Address/txtAddress'), 'Perumahan kota harapan Indah No.02')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Address/txtRT'), '009')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Address/txtRW'), '009')

not_run: WebUI.scrollToElement(findTestObject('TC.03_Leads Data Input/Address/txtRW'), 0)

WebUI.click(findTestObject('TC.03_Leads Data Input/Address/ddl_Province'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Address/span_ddlProvince_Banten'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Address/ddl_zipcode'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Address/txtZipcode'), '15315')

WebUI.click(findTestObject('TC.03_Leads Data Input/Address/a_SearchButton'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Address/ddl_chooseZipcode'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Address/a_ChooseButton'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Address/ddl_SameAddress'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Address/a_SaveButton'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Address/a_OkButton'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_financePurpose'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/span_ddlFinancePurpose_Consumtive'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_activity'))

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/span_ddlActivity_WalkInBFI'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/span_ddlActivity_EGC'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_referralName'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtBranchId'), '690')

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_SearchButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_chooseReferralName'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_ChooseButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_referralType'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/span_ddlReferralType_MarketingAgent'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_mediaPromotion'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/span_ddlMediaPromotion_Flyer'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_packageName'))

not_run: WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/span_ddlChoosePackageName'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_ChooseButton'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_supplier'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtSupplierName'), 'ABIDIN')

WebUI.click(findTestObject('TC.03_Leads Data Input/Address/a_SearchButton'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_chooseSupplier'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_ChooseButton'))

not_run: WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtDpAmount'), '1000500')

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_detailPengadaan'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/span_ddlDetailPengadaan_MobilBekas'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_tujuanPenggunaanMobil'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/span_ddlTujuanPenggunaanMobil_Pribadi'))

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtLokasiSerahTerimaPengadaan'), 'Rumah')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtDpAmount'), '1000500')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtPurchasePrice'), '178090000')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtTenor'), '24')

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_addRow'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtLicensePlate'), 'B 781 H')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtProductionYear'), '2011')

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_Brand'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtAssetCode'), 'CHEVROLET.AVEO.15AT')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtAssetDesc'), 'CHEVROLET')

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_SearchButtonPopUp2'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_chooseBrand'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_ChooseButtonPopUp2'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtNoRangka'), '457998090')

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_BpkbAtasNama'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_chooseBpkbAtasNama'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_Color'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_chooseColor'))

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtNoMesin'), '3557899099')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtNoBpkb'), '3557899098')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtAssetRegistName'), 'Aisha')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtAssetRegistAddress'), 'Jl. Mulia No.12')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtRT2'), '002')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtRW2'), '004')

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_AssetRegistProvince'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_ChooseAssetRegistProvince'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_AssetRegistZipCode'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtZipCode2'), '11730')

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_SearchButtonPopUp2'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_chooseZipcode2'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_ChooseButtonPopUp2'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_SifatKredit'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_chooseSifatKredit'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_SaveButtonPopUp'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_CalculateButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_OkButton'))

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_SaveButton'))

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_OkButton'))

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_SubmitButton'))

not_run: WebUI.delay(3)

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_OkButton'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()


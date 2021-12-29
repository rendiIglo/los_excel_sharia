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
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://los-k2app.dev-ad.co.id/CustomForm/')

WebUI.setText(findTestObject('Login/input_Username_UserName'), username)

WebUI.setText(findTestObject('Login/input_Username_Password'), password)

not_run: WebUI.setEncryptedText(findTestObject('Login/input_Username_Password'), '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('Login/a_Login'))

WebUI.click(findTestObject('Master/a_Leads Management'))

WebUI.click(findTestObject('Master/a_Leads Data Input'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 20)

WebUI.delay(2)

WebUI.verifyElementClickable(findTestObject('Master/ddl_SubBranch'))

WebUI.click(findTestObject('Master/ddl_SubBranch'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[8]/div[2]/div[2]/div/ul/li[@title=\'' + 
    branch_penginput) + '\']', 'Master/iframe_runtimePopup')

not_run: WebUI.click(findTestObject('Master/span_ddlSubBranch_Tangerang Syariah'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingGeraiInput'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingGeraiInput'), 20)

WebUI.click(findTestObject('Master/ddl_GeraiInput'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[8]/div[2]/div[2]/div/ul/li[@title=\'' + 
    branch_penginput) + '\']', 'Master/iframe_runtimePopup')

not_run: WebUI.click(findTestObject('Master/span_ddlGeraiInput_Tangerang Syariah'))

WebUI.click(findTestObject('Master/ddl_Product'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('//div[contains(@id,\'droplist\')]/div/div/div/ul/li[@title=\'' + 
    product) + '\']', 'Master/iframe_runtimePopup')

not_run: WebUI.click(findTestObject('Master/span_ddlProduct_My CarS'))

WebUI.click(findTestObject('Master/a_NextButton'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10, FailureHandling.OPTIONAL)

not_run: WebUI.click(findTestObject('Master/div_menuCustomer'))

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtCustomer'), customer_name)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtIdNo'), id_no)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtAreaPhone'), area_phone)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtPhone'), phone)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtMobilePhone1'), mobile_phone_1)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtMobilePhone2'), mobile_phone_2)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtDateOfBirth'), date_of_birth)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtEmail'), email)

WebUI.click(findTestObject('TC.03_Leads Data Input/Customer/ddl_MaritalStatus'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[24]/div[2]/div[2]/div/ul/li[@title=\'' + 
    marital_status_type) + '\']', 'Master/iframe_idIframe')

if (gender == 'Female') {
    WebUI.click(findTestObject('TC.03_Leads Data Input/Customer/rb_GenderFemale'))
} else {
    WebUI.click(findTestObject('TC.03_Leads Data Input/Customer/rb_GenderMale'))
}

if (nationality == 'WNI') {
    WebUI.click(findTestObject('TC.03_Leads Data Input/Customer/rb_NationalityWNI'))
} else {
    WebUI.click(findTestObject('TC.03_Leads Data Input/Customer/rb_NationalityWNA'))
}

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtPlaceOfBirth'), place_of_birth)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtMotherMaidenName'), mother_maiden_name)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtNpwp'), npwp)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtMonthlyIncome'), monthly_income)

if (marital_status_type == 'Married') {
    WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtNameSpouse'), name_spouse)

    WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtIdNoSpouse'), id_no_spouse)

    WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtMobilePhoneSpouse'), mobile_phone_spouse)

    WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtDateOfBirthSpouse'), date_of_birth_spouse)

    WebUI.setText(findTestObject('TC.03_Leads Data Input/Customer/txtPlaceOfBirthSpouse'), place_of_birth_spouse)
}

WebUI.click(findTestObject('TC.03_Leads Data Input/Customer/a_NextButton'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

try {
    WebUI.click(findTestObject('TC.03_Leads Data Input/Customer/a_OkButton'))
}
catch (Exception e) {
    WebUI.click(findTestObject('TC.03_Leads Data Input/Customer/a_NewDedupButton'))
} 
finally { 
}

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Address/txtAddress'), address)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Address/txtRT'), rt)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Address/txtRW'), rw)

not_run: WebUI.scrollToElement(findTestObject('TC.03_Leads Data Input/Address/txtRW'), 0)

WebUI.click(findTestObject('TC.03_Leads Data Input/Address/ddl_Province'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[25]/div[2]/div[2]/div/ul/li[@title=\'' + 
    province) + '\']', 'Master/iframe_idiframe')

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input/Address/span_ddlProvince_Banten'))

//WebUI.click(rendi.TestObjectHelper.getTestObjectWithXpath("/html/body/div[25]/div[2]/div[2]/div/ul/li[@title='BANTEN']"))
WebUI.click(findTestObject('TC.03_Leads Data Input/Address/ddl_zipcode'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Address/txtZipcode'), zip_code)

WebUI.click(findTestObject('TC.03_Leads Data Input/Address/a_SearchButton'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Address/ddl_chooseZipcode'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Address/a_ChooseButton'))

if (legal_same_address == 'Yes') {
    WebUI.click(findTestObject('TC.03_Leads Data Input/Address/ddl_SameAddress' //WebUI.click(rendi.TestObjectHelper.getTestObjectWithXpath("/html/body/div[25]/div[2]/div[2]/div/ul/li[@title='BANTEN']"))
            ))
} else {
    WebUI.setText(findTestObject('TC.03_Leads Data Input/Address/txtAddressLegal'), address_legal)

    WebUI.setText(findTestObject('TC.03_Leads Data Input/Address/txtRTLegal'), rt_legal)

    WebUI.setText(findTestObject('TC.03_Leads Data Input/Address/txtRWLegal'), rw_legal)

    not_run: WebUI.scrollToElement(findTestObject('TC.03_Leads Data Input/Address/txtRW'), 0)

    WebUI.click(findTestObject('TC.03_Leads Data Input/Address/ddl_ProvinceLegal'))

    WebUI.scrollToPosition(0, 0)

    CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[25]/div[2]/div[2]/div/ul/li[@title=\'' + 
        province_legal) + '\']', 'Master/iframe_idiframe')

    not_run: WebUI.click(findTestObject('TC.03_Leads Data Input/Address/span_ddlProvince_Banten'))

    WebUI.click(findTestObject('TC.03_Leads Data Input/Address/ddl_zipcodeLegal'))

    WebUI.delay(3)

    WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

    WebUI.setText(findTestObject('TC.03_Leads Data Input/Address/txtZipcode'), zip_code_legal)

    WebUI.click(findTestObject('TC.03_Leads Data Input/Address/a_SearchButton'))

    WebUI.delay(3)

    WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

    WebUI.click(findTestObject('TC.03_Leads Data Input/Address/ddl_chooseZipcode'))

    WebUI.click(findTestObject('TC.03_Leads Data Input/Address/a_ChooseButton'))
}

WebUI.click(findTestObject('TC.03_Leads Data Input/Address/a_SaveButton'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_financePurpose'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[25]/div[2]/div[2]/div/ul/li[@title = \'' + 
    finance_purpose) + '\']', 'Master/iframe_idiframe')

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/span_ddlFinancePurpose_Consumtive'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_activity'))

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/span_ddlActivity_WalkInBFI'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[25]/div[2]/div[2]/div/ul/li[@title = \'' + 
    activity) + '\']', 'Master/iframe_idiframe')

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/span_ddlActivity_EGC'))

if (activity == 'Employee Get Customer (EGC)') {
    WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_referralName'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

    WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtBranchId'), branch_id)

    WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_SearchButton'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

    WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_chooseReferralName'))

    WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_ChooseButton'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)
}

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_referralType'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[25]/div[2]/div[2]/div/ul/li[@title = \'' + 
    referral_type) + '\']', 'Master/iframe_idiframe')

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/span_ddlReferralType_MarketingAgent'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_mediaPromotion'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[25]/div[2]/div[2]/div/ul/li[@title = \'' + 
    media_promotion) + '\']', 'Master/iframe_idiframe')

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/span_ddlMediaPromotion_Flyer'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_packageName'))

not_run: WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/span_ddlChoosePackageName'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_ChooseButton'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_supplier'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtSupplierName'), supplier_name)

WebUI.click(findTestObject('TC.03_Leads Data Input/Address/a_SearchButton'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_chooseSupplier'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_ChooseButton'))

not_run: WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtDpAmount'), '1000500')

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_detailPengadaan'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[25]/div[2]/div[2]/div/ul/li[@title = \'' + 
    detail_pengadaan) + '\']', 'Master/iframe_idiframe')

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/span_ddlDetailPengadaan_MobilBekas'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_tujuanPenggunaanMobil'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[25]/div[2]/div[2]/div/ul/li[@title = \'' + 
    tujuan_penggunaan_mobil) + '\']', 'Master/iframe_idiframe')

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/span_ddlTujuanPenggunaanMobil_Pribadi'))

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtLokasiSerahTerimaPengadaan'), lokasi_serah_terima_pengadaan)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtDpAmount'), dp_amount)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtPurchasePrice'), purchase_price)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtTenor'), tenor)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_addRow'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtLicensePlate'), license_plate)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtProductionYear'), production_year)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_Brand'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

not_run: WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtAssetCode'), 'CHEVROLET.AVEO.15AT')

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtAssetDesc'), asset_desc)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_SearchButtonPopUp2'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_chooseBrand'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_ChooseButtonPopUp2'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtNoRangka'), no_rangka)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_BpkbAtasNama'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[5]/div[2]/div[2]/div/ul/li[@title = \'' + 
    bpkb_atas_nama) + '\']', 'Master/iframe_runtimePopup')

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_chooseBpkbAtasNama'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_Color'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[5]/div[2]/div[2]/div/ul/li[@title = \'' + 
    color) + '\']', 'Master/iframe_runtimePopup')

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_chooseColor'))

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtNoMesin'), no_mesin)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtNoBpkb'), no_bpkb)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtAssetRegistName'), asset_regist_name)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtAssetRegistAddress'), asset_regist_address)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtRT2'), rt_2)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtRW2'), rw_2)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_AssetRegistProvince'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[5]/div[2]/div[2]/div/ul/li[@title = \'' + 
    asset_regist_province) + '\']', 'Master/iframe_runtimePopup')

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_ChooseAssetRegistProvince'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_AssetRegistZipCode'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Detail/txtZipCode2'), zip_code_2)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_SearchButtonPopUp2'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_chooseZipcode2'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_ChooseButtonPopUp2'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_SifatKredit'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[5]/div[2]/div[2]/div/ul/li[@title = \'' + 
    sifat_kredit) + '\']', 'Master/iframe_runtimePopup')

not_run: WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/ddl_chooseSifatKredit'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_SaveButtonPopUp'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_CalculateButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_SaveButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Detail/a_SubmitButton'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

WebUI.scrollToPosition(0, 0)

WebUI.delay(1)

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Master/a_Leads Data Search'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(3)

WebUI.setText(findTestObject('TC.03_Leads Data Input/Leads Data Search (Variable)/txtLeadsName'), customer_name)

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Data Search (Variable)/ddl_ProductLeads'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('//div[contains(@id,\'droplist\')]/div/div/div/ul/li[@title=\'' + 
    product) + '\']', 'Master/iframe_idIframe')

WebUI.click(findTestObject('TC.03_Leads Data Input/Leads Data Search (Variable)/a_SearchButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 10)

//String leadsId = WebUI.getAttribute(findTestObject('/html/body/form/div[2]/div[1]/div/div[3]/div/div/div/div[3]/div[2]/div/div/table/tbody/tr[1]/td[3]'), 
//    'value')
String leadsId = WebUI.getText(findTestObject('TC.03_Leads Data Input/Leads Data Search (Variable)/ddl_LeadsId'))

println(leadsId)

String customerId = leadsId.substring(3)

println(customerId)

String customerIdSharia = 'C'.concat(customerId)

println(customerIdSharia)

WebUI.delay(3)

WebUI.callTestCase(findTestCase('Excel/Dummy activation on sharia web'), [('lead_id') : leadsId, ('customer_id') : customerId
        , ('customer_id_sharia') : customerIdSharia, ('activation_status') : 'Actived'], FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Excel/Collateral Appraisal'), [('leadsID') : leadsId], FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.callTestCase(findTestCase('Excel/ApprovalCA_Button Approve'), [('LeadsID') : leadsId], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Excel/Marketing Visit Sharia'), [('customerName') : customer_name, ('idNo') : id_no, ('areaPhone') : area_phone
        , ('phone') : phone, ('mobilePhone1') : mobile_phone_1, ('mobilePhone2') : mobile_phone_2, ('email') : email, ('education') : 'Conversion'
        , ('jumlahTanggungan') : '1', ('placeOfBirth') : place_of_birth, ('dateOfBirth') : date_of_birth, ('gender') : 'Male'
        , ('nationality') : 'WNA', ('maritalStatus') : 'Married', ('motherMaidenName') : mother_maiden_name, ('npwpPersonal') : npwp
        , ('monthlyIncome') : monthly_income, ('spouseName') : name_spouse, ('spouseMobilePhone') : mobile_phone_spouse, ('spouseIdNo') : id_no_spouse
        , ('spousePlaceOfBirth') : place_of_birth_spouse, ('spouseDateOfBirth') : date_of_birth_spouse, ('spouseProfession') : 'WIRASWASTA'
        , ('ecName') : 'Light Yagami', ('ecMobilePhone') : '08125667710', ('ecRelationship') : 'Friends', ('address') : address
        , ('rt') : rt, ('rw') : rw, ('province') : province, ('zipCode') : zip_code, ('homeStatus') : 'Sendiri', ('lamaTinggal') : '5'
        , ('sameWithLegal') : 'Yes', ('profession') : 'WIRASWASTA', ('employmentSince') : '2000', ('jobPosition') : 'Owner'
        , ('industryType') : 'JASA LAINNYA', ('businessScale') : 'Usaha Menengah', ('company') : 'CV. JASA OK', ('jobLevel') : 'Ketua'
        , ('ktpReceivedBy') : 'marketing syariah', ('ktpExpiredDate') : '28-Jun-2021', ('ktpFilePath') : 'KTP.png', ('ktpDocNo') : '1'
        , ('jumlahAnakTidakSekolah') : '0', ('biayaHidupBulanan') : '5000000', ('luasTanah') : '250', ('incomeBasedOn') : '4889900'
        , ('jumlahTanggunganAdditional') : '1', ('luasRumah') : '200', ('lebarJalan') : '50', ('jenisRumah') : 'Menengah'
        , ('penggunaanUnitJaminan') : 'Digunakan Debitur', ('lokasiPemakaian') : 'Dalam Kota', ('anBKRReguler') : 'Sendiri'
        , ('lokasiRumah') : 'Perkampungan', ('lamaMemilikiUnit') : '5', ('jenisBKRReguler') : 'Sertifikat Rumah', ('buktiKapasitas') : 'Slip Gaji Carbonized'
        , ('purposeFinancing') : 'Jual Beli (Syariah)', ('financePurpose') : finance_purpose, ('activity') : activity, ('referalType') : referral_type
        , ('mediaPromotion') : media_promotion, ('referalName') : 'ha', ('lokasiSerahTerima') : 'Rumah', ('detailPengadaan') : detail_pengadaan
        , ('tujuanPenggunaan') : tujuan_penggunaan_mobil, ('description') : product, ('supplierName') : supplier_name, ('licensePlate') : license_plate
        , ('productionYear') : production_year, ('noRangka') : no_rangka, ('color') : color, ('bpkbAtasNama') : bpkb_atas_nama
        , ('noMesin') : no_mesin, ('noBpkb') : no_bpkb, ('assetRegistrationAddress') : asset_regist_address, ('assetRegistrationName') : asset_regist_name
        , ('assetRegistrationRT') : rt_2, ('assetRegistrationRW') : rw_2, ('assetRegistrationProvince') : 'JAWA BARAT', ('sifatKredit') : sifat_kredit
        , ('assetDescription') : asset_desc, ('zipCodeAsset') : '16133', ('purchasePrice') : purchase_price, ('dpAmount') : dp_amount
        , ('tenor') : tenor, ('LeadsID') : leadsId], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Excel/VerifyMarketingVisit_Button Submit'), [('leadsID') : leadsId], FailureHandling.STOP_ON_FAILURE)

WebUI.navigateToUrl('http://los-k2app.dev-ad.co.id/workspace')

WebUI.setText(findTestObject('Login/input_Username_UserName'), username)

WebUI.setText(findTestObject('Login/input_Username_Password'), password)

WebUI.takeScreenshot()

WebUI.click(findTestObject('Login/a_Login'))

WebUI.delay(50)

WebUI.refresh()

WebUI.click(findTestObject('workspace/a_inbox'))

WebUI.delay(2)

String appNum = WebUI.getText(findTestObject('workspace/AppNumberSpan'))

WebUI.callTestCase(findTestCase('Excel/workspace'), [('username') : username, ('password') : password], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Excel/ApprovalCA_Button Approve'), [('AppNum') : appNum], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Excel/CreditApplicationCA_Submit'), [('AppNum') : appNum], FailureHandling.STOP_ON_FAILURE)

WebUI.delay(30)

WebUI.callTestCase(findTestCase('Excel/CreditApplicationOP_Submit'), [('AppNum') : appNum], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Excel/TitipanCustomer_Save'), [('AppNum') : appNum], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Excel/CollateralValidation_Saving data input'), [('AppNum') : appNum], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Excel/FundingPreparation_Button Submit'), [('AppNum') : appNum], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Excel/PrintDoc_Download file AKAD'), [('AppNum') : appNum], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Excel/PrintDoc_Download file BAST'), [('AppNum') : appNum], FailureHandling.STOP_ON_FAILURE)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

WebUI.closeBrowser()


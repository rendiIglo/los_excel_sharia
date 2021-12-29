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

WebUI.click(findTestObject('Master/a_Marketing Visit Sharia'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20, FailureHandling.OPTIONAL)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/txtLeadsID'), LeadsID)

WebUI.sendKeys(findTestObject('TC.05_Input Marketing Visit/txtLeadsID'), Keys.chord(Keys.TAB))

WebUI.delay(3)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/a_SearchButton'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/a_SearchButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingSearch'), 5, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingSearch'), 5, FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/span_FoundFirstData'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/a_Update'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 60, FailureHandling.OPTIONAL)

WebUI.delay(3)

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtCustomerName'), customerName)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtIDNo'), idNo)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtAreaPhone'), areaPhone)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtPhone'), phone)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtMobilePhone1'), mobilePhone1)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtMobilePhone2'), mobilePhone2)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtEmail'), email)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/ddlEducation'))

WebUI.scrollToPosition(0, 0)

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[50]/div[2]/div[2]/div/ul/li[@title = \'' + 
    education) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/ddlEducationItem_Conversion'))

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtJumlahTanggungan'), jumlahTanggungan)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtPOB'), placeOfBirth)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtDOB'), dateOfBirth)

not_run: if (gender == 'Female') {
    WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/radGender_Female'))
} else {
    WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/radGender_Male'))
}

not_run: if (nationality == 'WNI') {
    WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/radNationality_WNI'))
} else {
    WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/radNationality_WNA'))
}

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/ddlMaritalStatus'))

not_run: CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[50]/div[2]/div[2]/div/ul/li[@title = \'' + 
    maritalStatus) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/ddlMaritalStatusItem_Married'))

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtMotherMaidenName'), motherMaidenName)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtNPWPPersonal'), npwpPersonal)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtMonthlyIncome'), monthlyIncome)

if (maritalStatus == 'Married') {
    WebUI.comment('Spouse')

    WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtSpouseName'), spouseName)

    WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtSpouseMobilePhone'), spouseMobilePhone)

    WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtSpouseIDNo'), spouseIdNo)

    WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtSpousePOB'), spousePlaceOfBirth)

    WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtSpouseDOB'), spouseDateOfBirth)

    WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/ddlSpouseProfession'))

    WebUI.scrollToPosition(0, 0)

    CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[50]/div[2]/div[2]/div/ul/li[@title = \'' + 
        spouseProfession) + '\']', 'Master/iframe_idIframe')

    not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/ddlSpouseProfessionItem_WIRASWASTA'))
}

WebUI.comment('Emergency Contact')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtECName'), ecName)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtECMobilePhone'), ecMobilePhone)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/ddlECRelationship'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[50]/div[2]/div[2]/div/ul/li[@title = \'' + 
    ecRelationship) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/ddlECRelationshipitem_Friends'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/a_SaveButton'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20, FailureHandling.OPTIONAL)

WebUI.comment('Address')

WebUI.scrollToPosition(0, 0)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Address/txtAddress'), address)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Address/txtRT'), rt)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Address/txtRW'), rw)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ddlProvince'))

not_run: CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[51]/div[2]/div[2]/div/ul/li[@title = \'' + 
    province) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ddlProvinceItem_DKI JAKARTA RAYA'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/a_ZipCodeButton'))

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 5)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 5)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/txtZipCode'), zipCode)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/a_SearchButton'))

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/span_FoundFirstData'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/a_ChooseButton'))

not_run: WebUI.delay(1)

not_run: if (sameWithLegal == 'Yes') {
    WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/a_CopyFromLegal'))
}

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ddlHomeStatus'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[51]/div[2]/div[2]/div/ul/li[@title = \'' + 
    homeStatus) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ddlHomeStatusItem_Sendiri'))

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Address/txtLamaTinggal'), lamaTinggal)

WebUI.scrollToElement(findTestObject('TC.05_Input Marketing Visit/Address/a_SaveButton'), 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/a_SaveButton'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20, FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.comment('Job')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlProfession'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[51]/div[2]/div[2]/div/ul/li[@title = \'' + 
    profession) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlProfessionItem_WIRASWASTA'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlJobPosition'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[51]/div[2]/div[2]/div/ul/li[@title = \'' + 
    jobPosition) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlJobPositionItem_Owner'))

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Jobs/txtEmploymentSince'), employmentSince)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlIndustryType'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[51]/div[2]/div[2]/div/ul/li[@title = \'' + 
    industryType) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlIndustryTypeItem_JASA LAINNYA'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlBusinessScale'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[51]/div[2]/div[2]/div/ul/li[@title = \'' + 
    businessScale) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlBusinessScaleItem_Usaha Menengah'))

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Jobs/txtCompany'), company)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlJobLevel'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[51]/div[2]/div[2]/div/ul/li[@title = \'' + 
    jobLevel) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlJobLevelItem_Ketua'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlEmploymentStatus'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlEmploymentStatusItem_Permanen Status'))

WebUI.comment('Office Info')

not_run: WebUI.scrollToPosition(0, 0)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Jobs/txtCompanyAddress'), 'Jl. Daan Mogot No. 11')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlCompanyProvince'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlCompanyProvinceItem_DKI JAKARTA RAYA'))

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Jobs/txtCompanyPhoneArea'), '021')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Jobs/txtCompanyPhone'), '5672222')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Jobs/txtCompanyRT'), '001')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Jobs/txtCompanyRW'), '003')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/a_ZipCodeButton'))

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 5)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/txtZipCode'), '11510')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/a_SearchButton'))

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/span_FoundFirstData'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/a_ChooseButton'))

WebUI.comment('Other Jobs')

not_run: WebUI.scrollToElement(findTestObject('TC.05_Input Marketing Visit/Jobs/a_SaveButton'), 0)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlOtherJobProfession'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlOtherJobProfessionItem_PEKERJA SENI'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlOtherJobPosition'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlOtherJobPositionItem_Owner'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlOtherJobLevel'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlOtherJobLevelItem_Ketua'))

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Jobs/txtOtherJobIncome'), '3450000')

WebUI.scrollToElement(findTestObject('TC.05_Input Marketing Visit/Jobs/a_SaveButton'), 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/a_SaveButton'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.comment('Document')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/span_FoundEKTP'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/a_Upload'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingUploadFile'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingUploadFile'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtReceivedBy'), ktpReceivedBy)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtExpiredDate'), ktpExpiredDate)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtDocumentNumber'), ktpDocNo)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/divAttachFile'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.05_Input Marketing Visit/Document/divAttachFile'), 
    ('E:\\my Documents\\ekreasi\\internal project\\Katalon\\sharia-leads\\' + ktpFilePath) + '')

WebUI.delay(5)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/a_SaveButtonPopUp'))

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Documents/span_FoundNPWP'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/a_Upload'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingUploadFile'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingUploadFile'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtReceivedBy'), ktpReceivedBy)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtExpiredDate'), ktpExpiredDate)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtDocumentNumber'), ktpDocNo)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/divAttachFile'))

WebUI.delay(1)

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.05_Input Marketing Visit/Document/divAttachFile'), 
    ('E:\\my Documents\\ekreasi\\internal project\\Katalon\\sharia-leads\\' + ktpFilePath) + '')

WebUI.delay(5)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/a_SaveButtonPopUp'))

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('TC.05_Input Marketing Visit/Document/a_SaveButton'), 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/a_SaveButton'))

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.delay(1)

WebUI.comment('Additional')

WebUI.scrollToPosition(0, 0)

'lihat document di-comment atau ga.\r\nkalo di-comment klik tab additional'
WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/divAdditional'))

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/txtJumlahAnakTidakSekolah'), jumlahAnakTidakSekolah)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/txtBiayaHidupBulanan'), biayaHidupBulanan)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/txtLuasTanah'), luasTanah)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/txtIncomeBasedOn'), incomeBasedOn)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/txtJumlahTanggungan'), jumlahTanggunganAdditional)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/txtLuasRumah'), luasRumah)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/txtLebarJalan'), lebarJalan)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlJenisRumah'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[51]/div[2]/div[2]/div/ul/li[@title = \'' + 
    jenisRumah) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlJenisRumahItem_Menengah'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlPenggunaanUnitJaminan'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[51]/div[2]/div[2]/div/ul/li[@title = \'' + 
    penggunaanUnitJaminan) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlPenggunaanUnitJaminanItem_DigunakanDebitur'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlLokasiPemakaian'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[51]/div[2]/div[2]/div/ul/li[@title = \'' + 
    lokasiPemakaian) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlLokasiPemakaianItem_Dalam Kota'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlAnBKRReguler'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[51]/div[2]/div[2]/div/ul/li[@title = \'' + 
    anBKRReguler) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlAnBKRRegulerItem_Sendiri'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlLokasiRumah'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[51]/div[2]/div[2]/div/ul/li[@title = \'' + 
    lokasiRumah) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlLokasiRumahItem_Perkampungan'))

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/txtLamaMemilikiUnit'), lamaMemilikiUnit)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlJenisBKRReguler'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[51]/div[2]/div[2]/div/ul/li[@title = \'' + 
    jenisBKRReguler) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlJenisBKRRegulerItem_Sertifikat Rumah'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlBuktiKapasitas'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[51]/div[2]/div[2]/div/ul/li[@title = \'' + 
    buktiKapasitas) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlBuktiKapasitasItem_Slip Gaji Carbonized'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlPurposeFinancing'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[51]/div[2]/div[2]/div/ul/li[@title = \'' + 
    purposeFinancing) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlPurposeFinancingItem_Jual Beli (Syariah)'))

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/Income konsumen/txtOmzetPerBulan'), '4889900')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/Income konsumen/txtBiayaOperasional'), '588900')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/Income konsumen/txtBiayaProduksi'), '588901')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/Income konsumen/txtNetIncome'), '588902')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/NotaIncomeKonsumen/txtNotaPenjualan'), '588903')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/NotaIncomeKonsumen/txtNotaPembelian'), '4880000')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/NotaIncomeKonsumen/txtNetIncome'), '588904')

not_run: WebUI.comment('Income Pasangan')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/Income Pasangan/txtOmzetPerBulan'), '3000000')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/Income Pasangan/txtBiayaOperasional'), '300002')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/Income Pasangan/txtBiayaProduksi'), '300004')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/Income Pasangan/txtNetIncome'), '300001')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/NotaIncomePasangan/txtNotaPenjualan'), '300003')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/NotaIncomePasangan/txtNotaPembelian'), '300005')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/NotaIncomePasangan/txtNetIncome'), '3000000')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/a_SaveButton'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.comment('Leads Detail')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlFinancePurpose'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[51]/div[2]/div[2]/div/ul/li[@title = \'' + 
    financePurpose) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlFinancePurposeItem_Consumtive'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlActivity'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[51]/div[2]/div[2]/div/ul/li[@title = \'' + 
    activity) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlActivityItem_Employee Get Customer (EGC)'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlReferalType'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[51]/div[2]/div[2]/div/ul/li[@title = \'' + 
    referalType) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlReferalTypeItem_Supplier'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlMediaPromotion'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[51]/div[2]/div[2]/div/ul/li[@title = \'' + 
    mediaPromotion) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlMediaPromotionItem_Iklan Media Cetak'))

if (activity == 'Employee Get Customer (EGC)') {
    WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/a_ReferalName'))

    WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 5)

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

    WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/Referal/txtReferalName'), referalName)

    WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/Referal/a_SearchButton'))

    WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

    WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/Referal/span_FoundFirst'))

    WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/Referal/a_ChooseButton'))

    WebUI.delay(1)
}

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/txtLokasiSerahTerima'), lokasiSerahTerima)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlDetailPengadaan'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[51]/div[2]/div[2]/div/ul/li[@title = \'' + 
    detailPengadaan) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlDetailPengadaan_Mobil Bekas'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlTujuanPengunaan'))

CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[51]/div[2]/div[2]/div/ul/li[@title = \'' + 
    tujuanPenggunaan) + '\']', 'Master/iframe_idIframe')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlTujuanPengunaanItem_Pribadi'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/a_PackageName'))

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 5)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/PackageName/txtDescription'), description)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/PackageName/a_SearchButton'))

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/PackageName/span_FoundFirst'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/PackageName/a_ChooseButton'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/a_NamaPenyediaBarang'))

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 5)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/NamaPenyediaBarang/txtSupplierName'), supplierName)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/PackageName/a_SearchButton'))

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/PackageName/span_FoundFirst'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/PackageName/a_ChooseButton'))

not_run: WebUI.delay(1)

not_run: WebUI.comment('Collateral')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/spanCollateralFirstData'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/a_DeleteRow'))

not_run: WebUI.delay(1)

not_run: WebUI.scrollToPosition(0, 0)

not_run: WebUI.click(findTestObject('Master/a_OkBtn'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/a_AddRow'))

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 5)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/txtLicensePlate'), licensePlate)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/txtProductionYear'), productionYear)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/ddlCategory'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/ddlCategoryItem_SEDAN'))

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/txtNoRangka'), noRangka)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/ddlColor'))

not_run: CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[5]/div[2]/div[2]/div/ul/li[@title = \'' + 
    color) + '\']', 'Master/iframe_runtimePopup')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/ddlColorItem_Hitam'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/ddlBPKPAtasNama'))

not_run: CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[5]/div[2]/div[2]/div/ul/li[@title = \'' + 
    bpkbAtasNama) + '\']', 'Master/iframe_runtimePopup')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/ddlBPKPAtasNamaItem_Sendiri'))

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/txtNoMesin'), noMesin)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/txtAssetRegistrationAddress'), 
    assetRegistrationAddress)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/txtNoBPKP'), noBpkb)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/txtAssetRegistrationName'), 
    assetRegistrationName)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/txtAssetRegistrationRT'), 
    assetRegistrationRT)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/txtAssetRegistrationRW'), 
    assetRegistrationRW)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/ddlAssetRegistrationProvince'))

not_run: CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[5]/div[2]/div[2]/div/ul/li[@title = \'' + 
    assetRegistrationProvince) + '\']', 'Master/iframe_runtimePopup')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/ddlAssetRegistrationProvince_JAWA BARAT'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/ddlSifatKredit'))

not_run: CustomKeywords.'rendi.TestObjectHelper.clickTestObjectWithXPath'(('/html/body/div[5]/div[2]/div[2]/div/ul/li[@title = \'' + 
    sifatKredit) + '\']', 'Master/iframe_runtimePopup')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/ddlSifatKreditItem_Normal'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/a_Brand'))

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 5)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 0)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/Brand/txtAssetDescription'), 
    assetDescription)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/Brand/a_SearchButton'))

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 0)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/Brand/span_FoundFirst'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/Brand/a_ChooseButton'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/a_ZipCode'))

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 5)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 0)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/AssetZipCode/txtZipCode'), 
    zipCodeAsset)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/Brand/a_SearchButton'))

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 0)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/Brand/span_FoundFirst'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/Brand/a_ChooseButton'))

not_run: WebUI.delay(1)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/a_Save'))

not_run: WebUI.delay(1)

not_run: WebUI.scrollToPosition(0, 0)

not_run: WebUI.click(findTestObject('Master/a_OkBtn'))

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/FinanceInfo/txtPurchasePrice'), purchasePrice)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/FinanceInfo/txtDPAmount'), dpAmount)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/FinanceInfo/txtTenor'), tenor)

not_run: WebUI.delay(1)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/a_CalculateButton'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20, FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/a_SaveButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20, FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20, FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/a_SubmitButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 5, FailureHandling.OPTIONAL)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20, FailureHandling.OPTIONAL)

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.delay(3)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()


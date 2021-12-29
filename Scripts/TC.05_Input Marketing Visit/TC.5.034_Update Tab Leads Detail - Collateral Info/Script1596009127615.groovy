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

WebUI.click(findTestObject('Master/a_Marketing Visit Sharia'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/txtLeadsID'), '20200727690L001235')

WebUI.sendKeys(findTestObject('TC.05_Input Marketing Visit/txtLeadsID'), Keys.chord(Keys.TAB))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/a_SearchButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingSearch'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingSearch'), 5)

WebUI.delay(1)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/span_FoundFirstData'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/a_Update'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtCustomerName'), 'Shinigami Ryuk')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtIDNo'), '7562341412412111')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtAreaPhone'), '021')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtPhone'), '667788')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtMobilePhone1'), '08125667788')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtMobilePhone2'), '08125667789')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtEmail'), 'ryuk@gmail.com')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/ddlEducation'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/ddlEducationItem_Conversion'))

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtJumlahTanggungan'), '1')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtPOB'), 'Aceh')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtDOB'), '19-Sep-2001')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/radGender_Male'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/radNationality_WNA'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/ddlMaritalStatus'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/ddlMaritalStatusItem_Married'))

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtMotherMaidenName'), 'Ryuki')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtNPWPPersonal'), '234313254649011')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtMonthlyIncome'), '4889900')

WebUI.comment('Spouse')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtSpouseName'), 'Rem')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtSpouseMobilePhone'), '08125667787')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtSpouseIDNo'), '7562341412412112')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtSpousePOB'), 'Dunia Shinigami')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtSpouseDOB'), '19-Sep-2001')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/ddlSpouseProfession'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/ddlSpouseProfessionItem_WIRASWASTA'))

WebUI.comment('Emergency Contact')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtECName'), 'Light Yagami')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Customer/txtECMobilePhone'), '08125667710')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/ddlECRelationship'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/ddlECRelationshipitem_Friends'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/a_SaveButton'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.comment('Address')

WebUI.scrollToPosition(0, 0)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Address/txtAddress'), 'jl. raya no. 22')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Address/txtRT'), '001')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Address/txtRW'), '001')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ddlProvince'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ddlProvinceItem_DKI JAKARTA RAYA'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/a_ZipCodeButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/txtZipCode'), '11730')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/a_SearchButton'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/span_FoundFirstData'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/a_ChooseButton'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/a_CopyFromLegal'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ddlHomeStatus'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ddlHomeStatusItem_Sendiri'))

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Address/txtLamaTinggal'), '5')

WebUI.scrollToElement(findTestObject('TC.05_Input Marketing Visit/Address/a_SaveButton'), 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/a_SaveButton'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.comment('Job')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlProfession'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlProfessionItem_WIRASWASTA'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlJobPosition'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlJobPositionItem_Owner'))

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Jobs/txtEmploymentSince'), '2000')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlIndustryType'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlIndustryTypeItem_JASA LAINNYA'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlBusinessScale'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlBusinessScaleItem_Usaha Menengah'))

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Jobs/txtCompany'), 'CV. JASA OK')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlJobLevel'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlJobLevelItem_Ketua'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlEmploymentStatus'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlEmploymentStatusItem_Permanen Status'))

WebUI.comment('Office Info')

WebUI.scrollToPosition(0, 0)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Jobs/txtCompanyAddress'), 'Jl. Daan Mogot No. 11')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlCompanyProvince'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlCompanyProvinceItem_DKI JAKARTA RAYA'))

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Jobs/txtCompanyPhoneArea'), '021')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Jobs/txtCompanyPhone'), '5672222')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Jobs/txtCompanyRT'), '001')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Jobs/txtCompanyRW'), '003')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/a_ZipCodeButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/txtZipCode'), '11510')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/a_SearchButton'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/span_FoundFirstData'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/a_ChooseButton'))

WebUI.comment('Other Jobs')

WebUI.scrollToElement(findTestObject('TC.05_Input Marketing Visit/Jobs/a_SaveButton'), 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlOtherJobProfession'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlOtherJobProfessionItem_PEKERJA SENI'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlOtherJobPosition'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlOtherJobPositionItem_Owner'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlOtherJobLevel'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/ddlOtherJobLevelItem_Ketua'))

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Jobs/txtOtherJobIncome'), '3450000')

WebUI.scrollToElement(findTestObject('TC.05_Input Marketing Visit/Jobs/a_SaveButton'), 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Jobs/a_SaveButton'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

not_run: WebUI.comment('Document')

not_run: WebUI.scrollToPosition(0, 0)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/span_FoundEKTP'))

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/a_Upload'))

not_run: WebUI.waitForElementPresent(findTestObject('Master/divLoadingUploadFile'), 20)

not_run: WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingUploadFile'), 20)

not_run: WebUI.delay(1)

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtReceivedBy'), 'marketing syariah')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtExpiredDate'), '28-Jun-2021')

not_run: WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Document/txtDocumentNumber'), '1')

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/divAttachFile'))

not_run: WebUI.delay(1)

not_run: CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.05_Input Marketing Visit/Document/divAttachFile'), 
    'E:\\my Documents\\ekreasi\\internal project\\Katalon\\sharia-leads\\KTP.png')

not_run: WebUI.delay(5)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/a_SaveButtonPopUp'))

not_run: WebUI.click(findTestObject('Master/a_OkBtn'))

not_run: WebUI.delay(1)

not_run: WebUI.scrollToElement(findTestObject('TC.05_Input Marketing Visit/Document/a_SaveButton'), 0)

not_run: WebUI.click(findTestObject('TC.05_Input Marketing Visit/Document/a_SaveButton'))

WebUI.comment('Additional')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/divAdditional'))

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/txtJumlahAnakTidakSekolah'), '0')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/txtBiayaHidupBulanan'), '5000000')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/txtLuasTanah'), '250')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/txtIncomeBasedOn'), '4889900')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/txtJumlahTanggungan'), '1')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/txtLuasRumah'), '200')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/txtLebarJalan'), '50')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlJenisRumah'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlJenisRumahItem_Menengah'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlPenggunaanUnitJaminan'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlPenggunaanUnitJaminanItem_DigunakanDebitur'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlLokasiPemakaian'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlLokasiPemakaianItem_Dalam Kota'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlAnBKRReguler'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlAnBKRRegulerItem_Sendiri'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlLokasiRumah'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlLokasiRumahItem_Perkampungan'))

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/txtLamaMemilikiUnit'), '5')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlJenisBKRReguler'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlJenisBKRRegulerItem_Sertifikat Rumah'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlBuktiKapasitas'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlBuktiKapasitasItem_Slip Gaji Carbonized'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlPurposeFinancing'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/ddlPurposeFinancingItem_Jual Beli (Syariah)'))

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/Income konsumen/txtOmzetPerBulan'), '4889900')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/Income konsumen/txtBiayaOperasional'), '588900')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/Income konsumen/txtBiayaProduksi'), '588901')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/Income konsumen/txtNetIncome'), '588902')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/NotaIncomeKonsumen/txtNotaPenjualan'), '588903')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/NotaIncomeKonsumen/txtNotaPembelian'), '4880000')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/NotaIncomeKonsumen/txtNetIncome'), '588904')

WebUI.comment('Income Pasangan')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/Income Pasangan/txtOmzetPerBulan'), '3000000')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/Income Pasangan/txtBiayaOperasional'), '300002')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/Income Pasangan/txtBiayaProduksi'), '300004')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/Income Pasangan/txtNetIncome'), '300001')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/NotaIncomePasangan/txtNotaPenjualan'), '300003')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/NotaIncomePasangan/txtNotaPembelian'), '300005')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Additional/NotaIncomePasangan/txtNetIncome'), '3000000')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Additional/a_SaveButton'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.delay(1)

WebUI.comment('Leads Detail')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlFinancePurpose'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlFinancePurposeItem_Consumtive'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlActivity'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlActivityItem_Employee Get Customer (EGC)'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlReferalType'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlReferalTypeItem_Supplier'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlMediaPromotion'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlMediaPromotionItem_Iklan Media Cetak'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/a_ReferalName'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/Referal/txtReferalName'), 'ha')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/Referal/a_SearchButton'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/Referal/span_FoundFirst'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/Referal/a_ChooseButton'))

WebUI.delay(1)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/txtLokasiSerahTerima'), 'Di Rumah')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlDetailPengadaan'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlDetailPengadaan_Mobil Bekas'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlTujuanPengunaan'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/ddlTujuanPengunaanItem_Pribadi'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/a_PackageName'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/PackageName/txtDescription'), 'my cars')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/PackageName/a_SearchButton'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/PackageName/span_FoundFirst'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/PackageName/a_ChooseButton'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/a_NamaPenyediaBarang'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/NamaPenyediaBarang/txtSupplierName'), 'ASCO')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/PackageName/a_SearchButton'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/PackageName/span_FoundFirst'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/PackageName/a_ChooseButton'))

WebUI.delay(1)

WebUI.comment('Collateral')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/spanCollateralFirstData'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/a_DeleteRow'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/a_AddRow'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/txtLicensePlate'), 'D 566 SD')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/txtProductionYear'), '2012')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/ddlCategory'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/ddlCategoryItem_SEDAN'))

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/txtNoRangka'), '54677878')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/ddlColor'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/ddlColorItem_Hitam'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/ddlBPKPAtasNama'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/ddlBPKPAtasNamaItem_Sendiri'))

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/txtNoMesin'), '54677878')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/txtAssetRegistrationAddress'), 'JL. RAYA')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/txtNoBPKP'), '54677878')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/txtAssetRegistrationName'), 'RIRI')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/txtAssetRegistrationRT'), '001')

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/txtAssetRegistrationRW'), '010')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/ddlAssetRegistrationProvince'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/ddlAssetRegistrationProvince_JAWA BARAT'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/ddlSifatKredit'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/ddlSifatKreditItem_Normal'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/a_Brand'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 0)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/Brand/txtAssetDescription'), 'CHEVROLET AVEO 1.5 AT')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/Brand/a_SearchButton'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/Brand/span_FoundFirst'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/Brand/a_ChooseButton'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/a_ZipCode'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp2'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 0)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/AssetZipCode/txtZipCode'), '16133')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/Brand/a_SearchButton'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp2'), 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/Brand/span_FoundFirst'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/Brand/a_ChooseButton'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/LeadsDetail/CollateralInfo/a_Save'))

WebUI.delay(3)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()


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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://los-k2app.dev-ad.co.id/Identity/STS/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f%26wctx%3drm%253d1%2526id%253dpassive%2526ru%253d%25252fcustomForm%25252f%26wct%3d2020-04-18T06%253a35%253a06Z%26wreply%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f&wa=wsignin1.0&wtrealm=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f&wctx=rm%3d1%26id%3dpassive%26ru%3d%252fcustomForm%252f&wct=2020-04-18T06%3a35%3a06Z&wreply=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f')

WebUI.setText(findTestObject('Login/input_Username_UserName'), 'mktSyariah1')

WebUI.setEncryptedText(findTestObject('Login/input_Username_Password'), '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('Login/a_Login'))

WebUI.click(findTestObject('Master/a_Leads Management'))

WebUI.click(findTestObject('Master/a_Verify Marketing Visit Result'))

WebUI.delay(1)

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/txtLeadsID'), '20200527690L000636')

WebUI.sendKeys(findTestObject('TC.02_Verify Marketing Visit Result/txtLeadsID'), Keys.chord(Keys.TAB))

WebUI.delay(1)

WebUI.click(findTestObject('TC.04_Collateral Appraisal/a_SearchButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingSearch'), 5)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingSearch'), 5)

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/span_FoundFirstData'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/a_UpdateButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUpDocumentClosed'), 20)

WebUI.comment('Document')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Documents/span_FoundEKTP'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Documents/a_Upload'))

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Documents/txtReceivedBy'), 'MKT SYARIAH')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Documents/txtExpiredDate'), '01-Jul-2021')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Documents/txtDocumentNumber'), '1')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Documents/divAttachFile'))

CustomKeywords.'rendi.uploadNativePopUpWindow.uploadFile'(findTestObject('TC.02_Verify Marketing Visit Result/Documents/divAttachFile'), 
    'E:\\my Documents\\ekreasi\\internal project\\Katalon\\sharia-leads\\KTP.png')

WebUI.delay(3)

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Documents/a_SaveButtonPopUp'))

WebUI.click(findTestObject('Master/a_OkBtn'))

WebUI.comment('Customer')

WebUI.delay(3)

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Customer/span_UnmatchCustomerLegalName'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Customer/span_UnmatchIDNo'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Customer/span_UnmatchPOB'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Customer/span_UnmatchDOB'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Customer/span_UnmatchNationality'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Customer/span_UnmatchMaritalStatus'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Customer/span_UnmatchMotherMaidenName'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Customer/span_UnmatchNPWPPersonal'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Customer/span_UnmatchPasportNumber'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Customer/span_UnmatchPhoneNumber'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Customer/span_UnmatchMobile1'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Customer/span_UnmatchMobile2'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Customer/span_UnmatchEmail'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Customer/span_UnmatchEducation'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Customer/span_UnmatchMonthlyIncome'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Customer/span_UnmatchJumlahTanggungan'))

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Customer/txtCustomerName'), 'BUDIMAN')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Customer/txtIDNo'), '3209242806880001')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Customer/txtPOB'), 'Harjamukti Cirebon')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Customer/txtDOB'), '28-Jun-1988')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Customer/radNationality_WNI'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Customer/ddlMaritalStatus'), FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Customer/ddlMaritalStatusItem_Married'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Customer/txtMotherMaidenName'), 'Nyai Ratu Mas Subanglarang')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Customer/txtNPWPPersonal'), '321310090112130')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Customer/txtPassportNumber'), '320924280688001')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Customer/txtMobile1'), '085667890')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Customer/txtMobile2'), '085667891')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Customer/txtEmail'), 'budiman@bfi.co.id')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Customer/ddlEducation'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Customer/ddlEducationItem_STM'))

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Customer/txtMonthlyIncome'), '12500000')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Customer/txtJumlahTanggungan'), '1')

WebUI.comment('Spouse')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Spouse/span_UnmatchSpouseName'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Spouse/span_UnmatchSpouseIDNo'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Spouse/span_UnmatchSpouseGender'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Spouse/span_UnmatchSpousePOB'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Spouse/span_UnmatchSpouseDOB'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Spouse/span_UnmatchSpouseMobile1'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Spouse/span_UnmatchSpouseMobile2'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Spouse/span_UnmatchSpouseIncome'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Spouse/span_UnmatchSpouseProfession'))

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Spouse/txtSpouseName'), 'DWI WORO SEPTIYANI A')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Spouse/txtSpouseIDNo'), '3209265809940005')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Spouse/RadSpouseGender_Female'), FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Spouse/txtSpousePOB'), 'CIREBON')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Spouse/txtSpouseDOB'), '18-Sep-1993')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Spouse/txtSpouseMobile1'), '0812678901')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Spouse/txtSpouseMobile2'), '0812678902')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Spouse/txtSpouseIncome'), '0')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Spouse/ddlSpouseProfession'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Spouse/ddlSpouseProfessionItem_KARYAWAN SWASTA'))

WebUI.comment('Emergency Contact')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/EC/span_UnmatchECName'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/EC/span_UnmatchECRelationship'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/EC/span_UnmatchECMobile'))

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/EC/txtECName'), 'DWI SASONGKO')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/EC/ddlRelationship'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/EC/ddlRelationshipItem_Family'))

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/EC/txtECMobile'), '0812678903')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/EC/a_NextButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoading'), 20)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoading'), 20)

WebUI.comment('Address')

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Address/span_UnmatchAddress'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Address/span_UnmatchRTRW'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Address/span_UnmatchZipCode'))

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Address/txtAddress'), 'Jl. Raya No. 30')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Address/txtRT'), '014')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Address/txtRW'), '013')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Address/a_ZipCodeButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/txtZipCode'), '45162')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/a_SearchButton'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/span_FoundFirstData'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/a_ChooseButton'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Address/span_UnmatchHomeStatus'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Address/span_UnmatchLamaTinggal'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Address/span_UnmatchResidanceAddress'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Address/span_UnmatchResidanceRTRW'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Address/span_UnmatchResidanceZipCode'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Address/ddlHomeStatus'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Address/ddlHomeStatusItem_Keluarga'))

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Address/txtLamaTinggal'), '4')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Address/txtResidanceAddress'), 'Jl. Raya No. 30')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Address/txtResidanceRT'), '014')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Address/txtResidanceRW'), '013')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Address/a_ResidanceZipCodeButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/txtZipCode'), '45162')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/a_SearchButton'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/span_FoundFirstData'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/a_ChooseButton'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Address/ddlResidanceProvince'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Address/ddlResidanceProvinceItem_JAWA BARAT'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Address/a_NextButton'))

WebUI.comment('Jobs')

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/span_UnmatchProfession'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/span_UnmatchCompany'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/span_UnmatchJobPosition'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/span_UnmatchJobLevel'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/span_UnmatchEmploymentStatus'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/span_UnmatchEmploymentSince'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/span_UnmatchIndustryType'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/span_UnmatchBusinessScale'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/ddl_Profession'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/ddl_ProfessionItem_KARYAWAN SWASTA'))

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/jobs/txtCompanyName'), 'PT. MENDAYU')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/ddl_JobPosition'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/ddl_JobPositionItem_Conversion'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/ddl_JobLevel'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/ddl_JobLevelItem_Supervisor'))

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/jobs/txtEmploymentSince'), '2013')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/ddl_IndustryType'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/ddl_IndustryTypeItem_JASA LAINNYA'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/ddl_BusinessScale'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/ddl_BusinessScaleItem_Usaha menengah'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/span_UnmatchOfficeAddress'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/span_UnmatchOfficeZipCode'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/span_UnmatchOfficePhone'))

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/jobs/txtOfficeAddress'), 'Jl. Raya Anjung No.13')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/a_ZipCodeButton'))

WebUI.waitForElementPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.setText(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/txtZipCode'), '11510')

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/a_SearchButton'))

WebUI.waitForElementNotPresent(findTestObject('Master/divLoadingPopUp'), 0)

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/span_FoundFirstData'))

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Address/ZipCode/a_ChooseButton'))

WebUI.delay(1)

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/ddl_Province'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/ddl_ProvinceItem_JAWA BARAT'))

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/jobs/txtOfficePhoneArea'), '021')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/jobs/txtOfficePhoneNumber'), '4567777')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/span_UnmatchOtherProfession'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/span_UnmatchOtherPosition'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/span_UnmatchOtherLevel'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/span_UnmatchOtherIncome'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/ddl_OtherJobProfession'))

WebUI.scrollToPosition(0, 0)

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/ddl_OtherJobProfessionItem_Dosen'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/ddl_OtherJobPosition'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/ddl_OtherJobPositionItem_Conversion'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/ddl_OtherJobLevel'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/ddl_OtherJobLevelItem_SpecialistStaff'))

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/jobs/txtOtherJobIncome'), '10230000')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/jobs/a_NextButton'))

WebUI.delay(1)

WebUI.scrollToPosition(0, 0)

WebUI.comment('Additional Info')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/span_UnmatchAnakTidakSekolah'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/span_UnmatchTanggunganLain'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/span_UnmatchBiayaHidupBulanan'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/span_UnmatchLuasRumah'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/span_UnmatchLuasTanah'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/span_UnmatchLebarJalan'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/span_UnmatchJenisRumah'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/span_UnmatchLokasiRumah'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/span_UnmatchPenggunaanUnitJaminan'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/span_UnmatchLamaMemiliki'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/span_UnmatchLokasiPemakaian'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/span_UnmatchJenisBKRReguler'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/span_UnmatchANBKRReguler'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/span_UnmatchJenisBuktiKapasitas'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/span_UnmatchIncomeBuktiKapasitas'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/span_UnmatchProposedFinancing'))

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/txtAnakTidakSekolah'), '0')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/txtTanggunganLain'), '0')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/txtBiayaHidupBulanan'), '3200000')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/txtLuasRumah'), '300')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/txtLuasTanah'), '350')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/txtLebarJalan'), '50')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/ddlJenisRumah'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/ddlJenisRumahItem_Sederhana'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/ddlLokasiRumah'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/ddlLokasiRumahItem_Sederhana'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/ddlPenggunaanUnitJaminan'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/ddlPengunaanUnitJaminanItem_DigunananDebitur'))

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/txtLamaMemiliki'), '1')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/ddlLokasiPemakaianUnit'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/ddlLokasiPemakaianUnitItem_DalamKota'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/ddlJenisBKRReguler'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/ddlJenisBKRRegulerItem_Sertifikat Rumah'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/ddlAnBKRReguler'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/ddlAnBKRRegulerItem_Orang Tua'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/ddlBuktiKapasitas'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/ddlBuktiKapasitasItem_SPKSPMK'))

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/txtIncomeBasedOnBukti'), '3200000')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/ddlPurposedFinancing'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/ddlPurposedFinancingItem_Pembiayaan Jasa Syariah'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income konsumen Karyawan/span_UnmatchGajiKonsumen'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income konsumen Karyawan/span_UnmatchBonus'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income konsumen Karyawan/span_UnmatchHonor'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income konsumen Karyawan/span_UnmatchSertifikasi'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income konsumen Karyawan/span_UnmatchOtherIncome'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income konsumen Karyawan/span_UnmatchTotalIncome'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income konsumen Karyawan/span_UnmatchMutasiKredit'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income konsumen Karyawan/span_UnmatchMutasiDebet'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income konsumen Karyawan/span_UnmatchSisaSaldo'))

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income konsumen Karyawan/txtGajiKonsumen'), 
    '10500000')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income konsumen Karyawan/txtBonus'), '10500001')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income konsumen Karyawan/txtHonor'), '10500002')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income konsumen Karyawan/txtSertifikasi'), 
    '10500003')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income konsumen Karyawan/txtOtherIncome'), 
    '10500004')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income konsumen Karyawan/txtTotalIncome'), 
    '10500005')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income konsumen Karyawan/txtMutasiKredit'), 
    '10500006')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income konsumen Karyawan/txtMutasiDebet'), 
    '10500007')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income konsumen Karyawan/txtSisaSaldo'), '10500008')

WebUI.comment('pasangan')

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income Pasangan Karyawan/span_UnmatchGajiKonsumen'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income Pasangan Karyawan/span_UnmatchBonus'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income Pasangan Karyawan/span_UnmatchHonor'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income Pasangan Karyawan/span_UnmatchSertifikasi'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income Pasangan Karyawan/span_UnmatchOtherIncome'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income Pasangan Karyawan/span_UnmatchTotalIncome'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income Pasangan Karyawan/span_UnmatchMutasiKredit'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income Pasangan Karyawan/span_UnmatchMutasiDebet'))

WebUI.click(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income Pasangan Karyawan/span_UnmatchSisaSaldo'))

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income Pasangan Karyawan/txtGajiKonsumen'), 
    '9500001')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income Pasangan Karyawan/txtBonus'), '9500002')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income Pasangan Karyawan/txtHonor'), '9500003')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income Pasangan Karyawan/txtSertifikasi'), 
    '9500004')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income Pasangan Karyawan/txtOtherIncome'), 
    '9500005')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income Pasangan Karyawan/txtTotalIncome'), 
    '9500006')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income Pasangan Karyawan/txtMutasiKredit'), 
    '9500007')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income Pasangan Karyawan/txtMutasiDebet'), 
    '9500008')

WebUI.setText(findTestObject('TC.02_Verify Marketing Visit Result/Additional/Income Pasangan Karyawan/txtSisaSaldo'), '9500009')

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()


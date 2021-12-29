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

WebUI.openBrowser('')

WebUI.navigateToUrl('https://los-k2app.dev-ad.co.id/Identity/STS/Forms/Account/Login?ReturnUrl=%2fIdentity%2fsts%2fForms%2fwsfed%3fwa%3dwsignin1.0%26wtrealm%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f%26wctx%3drm%253d1%2526id%253dpassive%2526ru%253d%25252fcustomForm%25252f%26wct%3d2020-04-18T06%253a35%253a06Z%26wreply%3dhttp%253a%252f%252flos-k2app.dev-ad.co.id%252fcustomForm%252f&wa=wsignin1.0&wtrealm=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f&wctx=rm%3d1%26id%3dpassive%26ru%3d%252fcustomForm%252f&wct=2020-04-18T06%3a35%3a06Z&wreply=http%3a%2f%2flos-k2app.dev-ad.co.id%2fcustomForm%2f')

WebUI.setText(findTestObject('Login/input_Username_UserName'), username)

WebUI.setText(findTestObject('Login/input_Username_Password'), password)

not_run: WebUI.setEncryptedText(findTestObject('Login/input_Username_Password'), '1uQHKmaGceAjclSD1WUvrw==')

WebUI.click(findTestObject('Login/a_Login'))

WebUI.callTestCase(findTestCase('Excel/TC.3.120_Tab Menu - Leads data Input-Personal - Tab Leads Detail - Submit'), [('username') : 'mktSyariah1'
        , ('password') : 'Indocyber.100', ('customer_name') : 'Aisha Aziza', ('id_no') : '2345675209910001', ('area_phone') : '021'
        , ('phone') : '777212', ('mobile_phone_1') : '081234567890', ('mobile_phone_2') : '081234567891', ('date_of_birth') : '12-Sep-1991'
        , ('email') : 'sylvia@dev-ad.co.id', ('place_of_birth') : 'Aceh', ('mother_maiden_name') : 'Sarah', ('npwp') : '6800005009393000'
        , ('monthly_income') : '10000000', ('name_spouse') : 'Kang Ujang', ('id_no_spouse') : '2345671206890001', ('mobile_phone_spouse') : '0857363636'
        , ('date_of_birth_spouse') : '12-Jun-1989', ('place_of_birth_spouse') : 'Jakarta', ('address') : 'Perumahan kota harapan Indah No.02'
        , ('rt') : '009', ('rw') : '009', ('zip_code') : '15315', ('branch_id') : '690', ('supplier_name') : 'ABIDIN', ('lokasi_serah_terima_pengadaan') : 'Rumah'
        , ('dp_amount') : '150000000', ('purchase_price') : '178090000', ('tenor') : '24', ('license_plate') : 'B 0001 HR'
        , ('production_year') : '2011', ('asset_code') : 'CHEVROLET.AVEO.15AT', ('asset_desc') : 'CHEVROLET', ('no_rangka') : '457998090'
        , ('no_mesin') : '3557899099', ('no_bpkb') : '3557899098', ('asset_regist_name') : 'Aisha', ('asset_regist_address') : 'Jl. Mulia No.12'
        , ('rt_2') : '002', ('rw_2') : '004', ('zip_code_2') : '11730', ('branch_penginput') : 'TANGERANG SYARIAH', ('product') : 'My CarS'
        , ('marital_status_type') : 'Married', ('gender') : 'Female', ('nationality') : 'WNI', ('legal_same_address') : 'No'
        , ('address_legal') : 'Perumahan kota harapan Indah No.02', ('rt_legal') : '009', ('rw_legal') : '009', ('zip_code_legal') : '15315'
        , ('province') : 'BANTEN', ('province_legal') : 'BANTEN', ('finance_purpose') : 'Consumtive', ('activity') : 'Employee Get Customer (EGC)'
        , ('referral_type') : 'Marketing Agent', ('media_promotion') : 'Flyer', ('detail_pengadaan') : 'Mobil Bekas', ('tujuan_penggunaan_mobil') : 'Pribadi'
        , ('bpkb_atas_nama') : 'Sendiri', ('color') : 'Abu-abu', ('asset_regist_province') : 'DKI JAKARTA RAYA', ('sifat_kredit') : 'Normal'], 
    FailureHandling.STOP_ON_FAILURE)


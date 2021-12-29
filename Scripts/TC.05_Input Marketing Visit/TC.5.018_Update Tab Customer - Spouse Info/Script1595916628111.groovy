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

WebUI.click(findTestObject('TC.05_Input Marketing Visit/Customer/ddlSpouseProfessionItem_LAIN-LAIN'))

WebUI.delay(3)

WebUI.takeScreenshot(FailureHandling.STOP_ON_FAILURE)

not_run: WebUI.closeBrowser()


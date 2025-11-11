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

WebUI.openBrowser('https://digibank-identity-sit.msb.com.vn/auth/realms/employee/protocol/openid-connect/auth?response_type=code&client_id=employee-client&state=eEdDcnBnTm1VLmdSQ2kzbTMwWURteEp-VFhvSGRvY2VmcWl2MGdhfmNld09w&redirect_uri=https%3A%2F%2Fdigibank-employee-sit.msb.com.vn%2Frb%2Fselect-context&scope=openid&code_challenge=JLDFUEyJ02ugGMowKfOM1i999UcF9eonyzxLiJDq1kk&code_challenge_method=S256&nonce=eEdDcnBnTm1VLmdSQ2kzbTMwWURteEp-VFhvSGRvY2VmcWl2MGdhfmNld09w')

WebUI.waitForElementVisible(findTestObject('MHLogin/txtUsername'), 2)

WebUI.setText(findTestObject('MHLogin/txtUsername'), 'admin')

WebUI.setText(findTestObject('MHLogin/txtPassword'), 'admin')


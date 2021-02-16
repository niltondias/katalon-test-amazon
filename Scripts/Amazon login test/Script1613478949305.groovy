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

'Abre o Navegador'
WebUI.openBrowser('')

'Abre a URL solicitada'
WebUI.navigateToUrl('https://www.amazon.com/')

//WebUI.click(findTestObject('Object Repository/Page_Amazon.com Online Shopping for Electro_1f0c68/span_ Orders_nav-cart-icon nav-sprite'))
'Clica no ícone do carrinho'
WebUI.click(findTestObject('Page_Menu_Carrinho/span_ botão_carrinho'))

'Clicar no botão logar na tela do carrinho'
WebUI.click(findTestObject('Page_Amazon.com Shopping Cart/span_botao_logar_carrinho'))

'Prechender o campo e-mail da tela do carrinho'
WebUI.setText(findTestObject('Page_Amazon Sign-In/input_Email ou telefone'), email)

'Clicar no botão continuar'
WebUI.click(findTestObject('Page_Amazon Sign-In/input_Botao_Entrar_email'))


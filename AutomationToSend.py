# -*- coding: utf-8 -*-
"""
Created on Sat Oct 30 20:39:35 2021

@author: reube
"""

import sys 
import requests 
import pandas as pd   
from bs4 import BeautifulSoup 
from selenium import webdriver   
from selenium.webdriver.chrome.options import Options 
from selenium.webdriver.common.action_chains import ActionChains 
from selenium.webdriver.common.by import By
import time  
from selenium.webdriver.support.ui import Select 
with requests.Session() as s:  
    url="https://www.vils.academy/client/dashboard" 
    r=s.get(url) 
    print(r.content)
#userInput=input("enter your eamil: ") 
def starter(s):
#names=pd.read_excel('VILS Academy Add a User (Single or Complete Roster) (1).xlsx') 
    url = "https://docs.google.com/spreadsheets/d/1EtV8Pijuw3sv_LkWkEdlq8EKqQwSZ-plJd2HMaziZmc/edit?pli=1#gid=989431918"
    response = requests.get(url) 
    print(response.status_code) 
    print(response.text) 
    #this part of my code sends me to the vils academy website
    soup = BeautifulSoup(response.text,'html.parser') 
    print(soup.find_all('a'))
    driver = webdriver.Chrome('./chromedriver') 
    url_to_search="https://www.vils.academy/client/dashboard"  
    driver.get(url_to_search)   
    # types the login info for me to log in each time
    username=driver.find_element_by_xpath('//*[@id="FormName"]/span[1]/input')  
    username.send_keys("xxxxxxxxx")  #you can put in your own log in credentials is you want to use this code
    password=driver.find_element_by_xpath('//*[@id="FormName"]/span[2]/input')  
    password.send_keys('xxxxxx')   
    #This is the thing that clicks the button
    login = driver.find_element_by_xpath('//*[@id="FormName"]/div/input[1]')  
    login.click()
    #click through admin page dropdown, find the teacher , send the login link  
    
    admin = driver.find_element_by_xpath('//*[@id="sidebar"]/div/a[10]') 
    admin.click()  
    time.sleep(2)
    learners = driver.find_element_by_xpath('//*[@id="learner"]/div[1]') 
    learners.click() 
    time.sleep(2) 
    learners2=driver.find_element_by_xpath('//*[@id="learner_submenu"]/div[2]/div/a[1]/h3') 
    learners2.click()  
    time.sleep(2) 
    teachers1=driver.find_element_by_xpath('//*[@id="content"]/div[4]/a[4]') 
    teachers1.click() 
    time.sleep(2)  
    teachers2=driver.find_element_by_xpath('//*[@id="activeAccounts_filter"]/label/input') 
    
    teachers2.send_keys(s)  
    time.sleep(5) 
    noUserCheck=driver.find_element_by_xpath('//*[@id="activeAccounts"]/tbody/tr/td')
    time.sleep(2) 
    comPlete=""
    if noUserCheck.text=="No matching records found":   
         comPlete=f'{s} does not exist'  
         print(comPlete)
         driver.close()
         sys.exit()  
         return comPlete
    else:
        editUser=driver.find_element_by_xpath('//*[@id="activeAccounts"]/tbody/tr/td[8]/a') 
        editUser.click()   
        time.sleep(3)
        editUsername=driver.find_element_by_id("email")    
        editEmail=driver.find_element_by_id("username")   
        #this is where the if statement goes to check if the username is the email then changes it
        #create a function that takes in a value 
        val=editUsername.get_attribute('value')   
        val2=editEmail.get_attribute('value') 
        if val!= s or val2!=s: 
            time.sleep(3)  
            editUsername.clear()  
            time.sleep(3) 
            editUsername.send_keys(s)  
            time.sleep(3) 
            editEmail.clear() 
            time.sleep(3)
            editEmail.send_keys(s)
            time.sleep(3) 
            #saveChanges=driver.find_element_by_xpath('//*[@id="FormName"]/div/span[14]/input[1]') 
            #saveChanges.click()   
            
        time.sleep(3)
        saveChanges=driver.find_element_by_xpath('//*[@id="FormName"]/div/span[14]/input[1]') 
        saveChanges.click()  
        time.sleep(4)   
        sendLoginEmail=driver.find_element_by_xpath("//span[text()='Send Login Link']")
        sendLoginEmail.click()  
        time.sleep(5)
        sendLoginLink=driver.find_element_by_xpath('//*[@id="FormName"]/div/input[1]')
        time.sleep(5)
        sendLoginLink.click()   
        time.sleep(2)
        #driver.close() 
        comPlete=f'{s}exists, had credentials corrected, and recieved login link.'
        return comPlete 
    return comPlete
if __name__=="__main__":  
    print(starter("bennettl@apsk12.org"))  
    
    
    
   
    
    


# Unit 2 - Data for Social Good Project

## Introduction

Software engineers develop programs to work with data and provide information to a user. Each user has different needs based on the information they are looking for from data. Your goal is to create a data analysis program for your user that stores and analyzes data to provide the information they need.

## Requirements

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data analysis program:
- **Write a class** – Write a class to represent your user or business and store and analyze their data with no-argument and parameterized constructors.
- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that your user needs information about.
- **Write a method** – Write a method that finds or manipulates the elements in a 1D array to provide the information your user needs.
- **Implement a toString() method** – Write a toString() method that returns general information about the data (for example, number of values in the dataset).
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## User Story 

Include your User Story you analyzed for your project here. Your User Story should have the following format: 

> As a Basketball enthusiast, <br> 
> I want to see information about NBA teams from their city and their founding years, <br> 
> so that I can learn which teams are the oldest and identify patterns in team history.

## Dataset 

Dataset: https://www.kaggle.com/datasets/wyattowalsh/basketball/data?select=csv
- **Citys** (String) - Name of citys
- **Team** (String) - Team from each city
- **Year Founded** (int) - Year the team was founded

## UML Diagram 



UML Diagram for my project! ![Screenshot 2025-11-18 174705.png](<Screenshot 2025-11-18 174705.png>)

## Description 

This project uses object-oriented programming to model NBA teams with the TeamInfo class, which stores the city, team name, and founding year. The UserStory class stores an array of these objects and provides methods to analyze the data. The program also uses 1D arrays to store data read from three text files: cities, team names, and founding years. The toString() method provides a summary of all teams and the total number of teams, making it easy for a user to view the dataset.
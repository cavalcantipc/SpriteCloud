# SpriteCloud

This is Pedro Leite's test project for the SpriteCloud recruiting process.
To run the tests, follow the instructions bellow:

## Running tests locally
**UI Tests:**
- Download repository
- Open project (preferencially using IntelliJ IDEA)
- Open Maven menu
- Run Maven Install script

Running outside IntelliJ IDEA
- Download Apache Maven https://maven.apache.org/download.cgi
- Install Maven https://www.baeldung.com/install-maven-on-windows-linux-mac
- Go to UITests folder
- Run the following command and results will be stored on target folder
```sh
mvn clean install
```

**API Tests:**
- You are going to need Node.js installed https://nodejs.org/en/
- The go to terminal and run the command
```sh
npm install -g newman
```
- Go to APITests folder
- Run the following command
```sh
newman run APITests.postman_collection.json --global-var "base_url=https://petstore.swagger.io/v2" --suppress-exit-code -r htmlextra --reporter-htmlextra-export testArtifacts/htmlreport.html 
```
- This command calls Newman and runs the tests on the Postman collection, using the variable "base_url" and storing html reports on testArtifacts folder

## Running tests locally
- On github, go to Actions tab
- Select the workflow you want to run on the left side menu
-- Maven CI for UI tests
-- Newman Run for API Tests
- Click on Run Workflow and confirm
- After finished, enter on the execution you just created and the report will be there to download

## Results on Calliope.pro
Tests results can be found on Callipe.pro on the following link https://app.calliope.pro/profiles/4051/reports

# Selected scenarios
## UI Tests
The scenarios on the UI tests were select thinking on the most common scenarios when testing web applications. Considering they the most important on automation daily life.
The scenarios were:
- Finding and interacting with an element without id (Class Attribute scenario)
- Waiting for an element to be displayed without breaking the tests (Client Delay scenario)
- Finding an element on a dynamic page (Dynamic Table scenario)

## API Tests
The scenarios on the UI tests were select in a way to show different types of http request, to showcase the idea of testing APIs in any scenario.
- Post
- Get
- Push
- Delete

# Next steps
## UI Tests
For UI tests, the next steps would be cover the entire application, using E2E tests only on the main flow.
To cover alternative scenarios it would be interesting using different test approches, like frontend tests.

## API Tests
For API tets, the next steps would also be to cover the entire application, but in this case, we could also test alternative scenarios as invalid data, errors and so on.

# Calliope.pro
# Improvement point
As an improvement point, I suggest it was possible to see information about more reports on the profile overview, like the last 3 or 5 and user could switch between them. It is only possible to see the last report, in my case I uploaded 2 reports of differnt kinds, I think it would be interesting if I could see the other one.

# New Feature
As a new feature, I believe it would be interesting to have a place to list the bugs found during test executions.

# Software Process Alpaca Team Project

## Backend
### Setup file before develop
1. create file `build.bat` by copy from `build.bat.example`
```
cp build.bat.example build.bat
```
2. create file `start.bat`  by copy from `start.bat.example`
```
cp start.bat.example start.bat
```
3. Define value of following variable in `start.bat` and `build.bat`
- DB_URL
- DB_USERNAME
- DB_PASSWORD

## Frontend
### Setup file before develop
1. install `node_module` with command `npm install` or `yarn`
### Start service for development
```
yarn run serve
```
### Build code for production
```
yarn run build
```
### Run your tests
```
yarn run test
```
### Check format code and fixes files
```
yarn run lint
```

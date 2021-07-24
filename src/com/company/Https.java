package com.company;

public class Https {
    /*
    *
const https = require("https")

async function getMovieList(year) {

  let titles = [];
  return new Promise((resolve) => {
   https.get(`https://jsonmock.hackerrank.com/api/movies?Year=${year}`, (resp)=> {
    let data = '';
    resp.on('data', (chunk) =>{
      data += chunk
    });

    resp.on('end', ()=> {
      resolve(convertData(JSON.parse(data).data));
    });
  }).on("error", (err) => {
    console.log("error: "+ err.message)
  })
})
  function convertData(data) {

  for(let i = 0;i <data.length; i++) {
    titles.push(data[i].Title)
  }
  return titles
}

}

async function main() {
const result = await getMovieList(2015)
if(result.length > 0){
  for(const title of result){
    console.log(title);
  }
}else{
  console.log('No Result Found')
}
}

main()
    *
    * */
}

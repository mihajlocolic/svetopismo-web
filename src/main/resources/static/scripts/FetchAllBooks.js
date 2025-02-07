async function fetchAllBooks() {
    let bookDataPromise = fetch("http://localhost:8080/knjige/", {method: 'GET'});

    let jsonPromise = bookDataPromise.then((res) => {
        if(res.ok) {
            return res.json();
        } else {
            console.error("Promise failed.");
        }
    });

    jsonPromise.then((jsonData) => {
        if (jsonData) { 
            // console.log(JSON.stringify(jsonData));
            let bookObject = JSON.parse(JSON.stringify(jsonData));
            // console.log(bookObject);
            for (let i = 0; i < bookObject.length; i++) {
                document.getElementById("content").innerHTML += "<a href='#'>" + bookObject[i].bookId + ". " + bookObject[i].bookName + "</a>" + '<br>';
            }
        } else {
            console.log("No data could be retrieved.");
            document.getElementById("content").innerHTML = "No data could be retrieved.";
        }
    });
}


window.onload = async (event) => {
    console.log("Page loaded.");
    await fetchAllBooks();
}





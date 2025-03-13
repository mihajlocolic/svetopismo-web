
document.getElementById("chapterSearchForm").addEventListener("submit", function(event) {

    const bookName = document.getElementById("bookName").value;
    const chapterNumber = document.getElementById("chapterNumber").value;
    console.log(bookName);
    console.log(chapterNumber);
    handleSearch(event, bookName, chapterNumber);
});

function handleSearch(event, bookName, chapterNumber) {
    console.log("Form submitted.");
    // event.preventDefault();

    axios.get(`http://localhost:8080/glava?bookName=${bookName}&chapterNumber=${chapterNumber}`)
        .then(function(response) {
            console.log(JSON.stringify(response));
        })
        .catch(function(error) {
            console.log(error);
        });
}
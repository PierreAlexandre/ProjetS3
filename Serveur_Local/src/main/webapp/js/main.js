function main()
{
    var formParameter = document.getElementById("formParameter").value;
    var xmlhttp = new XMLHttpRequest();
    var url = "api/annonce?id=" + formParameter;

    xmlhttp.onreadystatechange = function() {
        if (this.readyState == 4 && this.status == 200) {
            var myArr = JSON.parse(this.response);
            document.getElementById("main").innerHTML = this.response;
        }
    };
    xmlhttp.open("GET", url, true);
    xmlhttp.send();
}
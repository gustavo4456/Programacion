let contenedor = document.getElementById("contenedor");
let imagenGato = document.createElement("img");
let generarOtroGif = document.createElement("input");
let texto = document.createElement("h1");

generarOtroGif.type = "button";
generarOtroGif.value = "Generar nuevo gif";

const manipulacionCadena = (cadena) => cadena.split(" ", 3).join(" ");

const llamarApiGif = (cadenaGato, cadenaCompleta) => {
    let apiKey = "qCgOVQJ4v2YNeDHXY0Fy3IGTSyAv1zYe";
    let url = `https://api.giphy.com/v1/gifs/search?q=${cadenaGato}&api_key=${apiKey}`;

    fetch(url)
        .then((res) => res.json())
        .then((gifs) => {
            let arrayCompletoGif = gifs.data;

            imagenGato.src = gifs.data[0].images.original.url;
            texto.innerHTML = cadenaCompleta;

            generarOtroGif.onclick = () => {
                let indice = Math.floor(Math.random() * 49) + 0;
                console.log(arrayCompletoGif[indice].images.original.url);
                imagenGato.src = arrayCompletoGif[indice].images.original.url;
            };

            contenedor.appendChild(texto);
            contenedor.appendChild(imagenGato);
            contenedor.appendChild(generarOtroGif);
        })
        .catch((err) => console.log("error", err));
};

const llamarApiUnGato = (url) => {
    fetch(url)
        .then((res) => res.json())
        .then((data) => {
            let cadenaCompleta = data.fact;
            let cadenaManipulada = manipulacionCadena(cadenaCompleta);
            llamarApiGif(cadenaManipulada, cadenaCompleta);
        })
        .catch((err) => console.log(err));
};

llamarApiUnGato("https://catfact.ninja/fact");

 export class persona{
    id?: number;
    nombre: String;
    apellido: String;
    img: String;

    constructor(nombre: String, apellido: String, img: String){
        this.apellido = apellido;
        this.nombre = nombre;
        this.img = img;
    }

 }
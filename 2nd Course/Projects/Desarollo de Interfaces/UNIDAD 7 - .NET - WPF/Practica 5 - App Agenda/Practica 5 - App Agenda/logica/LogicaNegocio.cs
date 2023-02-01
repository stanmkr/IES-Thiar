using Practica_5___App_Agenda.dto;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practica_5___App_Agenda.logica
{
    public class LogicaNegocio
    {
        public ObservableCollection<Libro> listaLibros { get; set; }
        public LogicaNegocio()
        {
            listaLibros = new ObservableCollection<Libro>();
            listaLibros.Add(new Libro("Un titulo", "Autor", DateTime.Now));
        }

        public void anyadirLibro(Libro libro)
        {
            listaLibros.Add(libro);
        }

        public void modificarLibro(Libro libro, int posicion)
        {
            listaLibros[posicion] = libro;
        }

    }
}

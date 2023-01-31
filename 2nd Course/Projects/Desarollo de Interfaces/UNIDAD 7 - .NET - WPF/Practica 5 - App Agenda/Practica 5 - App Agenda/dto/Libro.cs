using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace Practica_5___App_Agenda.dto
{
    public class Libro : INotifyPropertyChanged
    {
        private String titulo;
        public String Titulo
        {
            get { return titulo; }
            set
            {
                titulo = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Titulo"));
            }
        }

        private String autor;
        public String Autor
        {
            get { return autor; }
            set
            {
                autor = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("Autor"));
            }
        }

        private DateTime fechaEntrada;
        public DateTime FechaEntrada
        {
            get { return fechaEntrada; }
            set
            {
                fechaEntrada = value;
                this.PropertyChanged(this, new PropertyChangedEventArgs("FechaEntrada"));

            }
        }
        public Libro(String titulo, String autor, DateTime fechaEntrada)
        {
            this.titulo= titulo;
            this.autor= autor;
            this.fechaEntrada= fechaEntrada;
        }

        public event PropertyChangedEventHandler PropertyChanged;
    }
}

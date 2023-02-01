using Practica_5___App_Agenda.dto;
using Practica_5___App_Agenda.logica;
using System;
using System.Collections.Generic;
using System.Collections.ObjectModel;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows;
using System.Windows.Controls;
using System.Windows.Data;
using System.Windows.Documents;
using System.Windows.Input;
using System.Windows.Media;
using System.Windows.Media.Imaging;
using System.Windows.Navigation;
using System.Windows.Shapes;

namespace Practica_5___App_Agenda
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        private LogicaNegocio logicaNegocio;

        public MainWindow()
        {
            InitializeComponent();
            logicaNegocio = new LogicaNegocio();    
            dataGridLibros.DataContext = logicaNegocio;
        }

        private void menuItemNuevo_Click(object sender, RoutedEventArgs e)
        {
            DialogoLibro dialogoLibro = new DialogoLibro(logicaNegocio);
            dialogoLibro.ShowDialog();
        }
    }
}

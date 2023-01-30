using Practica_2___App_Selector.dto;
using System;
using System.Collections.Generic;
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

namespace Practica_2___App_Selector
{
    /// <summary>
    /// Lógica de interacción para MainWindow.xaml
    /// </summary>
    public partial class MainWindow : Window
    {
        public MainWindow()
        {
            InitializeComponent();
            List<Persona> listaPersonas = new List<Persona>();
            listaPersonas.Add(new Persona("Pablo","Gonzalez"));
            listaPersonas.Add(new Persona("Antonio", "Sanchez"));
            foreach(Persona persona in listaPersonas)
            {
                ComboBoxItem comboBoxItem = new ComboBoxItem();
                comboBoxItem.Content= persona;
                comboBoxPersonas.Items.Add(comboBoxItem);
            }
        }

        private void ComboBox_SelectionChanged(object sender, SelectionChangedEventArgs e)
        {
            ComboBoxItem comboBoxItem = (ComboBoxItem)comboBoxPersonas.SelectedItem;
            Persona persona = (Persona)comboBoxItem.Content;
            labelNombre.Content = persona.Nombre;
            labelApellidos.Content = persona.Apellidos;

        }
    }
}

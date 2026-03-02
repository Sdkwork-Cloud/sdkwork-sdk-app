using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class Region
    {
        public int? X { get; set; }
        public int? Y { get; set; }
        public int? Width { get; set; }
        public int? Height { get; set; }
    }
}

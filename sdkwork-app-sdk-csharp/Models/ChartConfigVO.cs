using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ChartConfigVO
    {
        public bool? ShowLegend { get; set; }
        public bool? ShowTooltip { get; set; }
        public bool? Responsive { get; set; }
        public int? Height { get; set; }
    }
}

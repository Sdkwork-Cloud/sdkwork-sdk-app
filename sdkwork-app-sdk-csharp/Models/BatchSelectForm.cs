using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class BatchSelectForm
    {
        public List<int>? ItemIds { get; set; }
        public bool? Selected { get; set; }
    }
}

using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class DatasetVO
    {
        public string? Label { get; set; }
        public List<object>? Data { get; set; }
        public List<string>? BackgroundColor { get; set; }
        public List<string>? BorderColor { get; set; }
        public int? BorderWidth { get; set; }
    }
}

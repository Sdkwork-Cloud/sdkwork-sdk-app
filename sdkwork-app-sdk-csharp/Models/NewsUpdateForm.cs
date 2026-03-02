using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class NewsUpdateForm
    {
        public string? Title { get; set; }
        public string? Summary { get; set; }
        public string? Url { get; set; }
        public string? Source { get; set; }
    }
}

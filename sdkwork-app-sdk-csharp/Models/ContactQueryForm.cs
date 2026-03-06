using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class ContactQueryForm
    {
        public string? Keyword { get; set; }
        public string? Region { get; set; }
        public bool? IsOnline { get; set; }
    }
}

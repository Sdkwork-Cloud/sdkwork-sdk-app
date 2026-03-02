using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class VideoStyleTransferForm
    {
        public string? VideoUrl { get; set; }
        public string? Style { get; set; }
        public string? Model { get; set; }
    }
}

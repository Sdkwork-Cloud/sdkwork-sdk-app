using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class MusicUpdateForm
    {
        public string? Title { get; set; }
        public string? Description { get; set; }
    }
}

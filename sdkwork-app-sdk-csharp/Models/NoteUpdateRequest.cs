using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class NoteUpdateRequest
    {
        public string? Title { get; set; }
        public string? Content { get; set; }
        public List<string>? Tags { get; set; }
    }
}

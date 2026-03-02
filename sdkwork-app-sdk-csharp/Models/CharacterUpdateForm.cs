using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CharacterUpdateForm
    {
        public string? Name { get; set; }
        public string? Description { get; set; }
        public string? Personality { get; set; }
        public string? Background { get; set; }
    }
}

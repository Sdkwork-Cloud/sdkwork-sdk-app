using System;
using System.Collections.Generic;
using System.Text.Json.Serialization;

namespace App.Models
{
    public class CharacterBatchGenerationForm
    {
        public List<CharacterItem>? Characters { get; set; }
        public string? Model { get; set; }
    }
}
